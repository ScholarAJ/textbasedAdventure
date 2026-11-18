package com.github.scholaraj.textbasedAdventure.core.cmd;

import java.util.ArrayList;

public class InputLexer {
    
    /* Class that breaks player commands into useable tokens */

    /* Grammar for the following class is: 
    
    <Command> -> (<Look> | <Move> | <Take> | <Use> )

    <Look> -> (LOOK | look) ("at" | "AT")? <Obj>
    <Move> -> (MOVE | move) <Direction>
    <Take> -> (TAKE | take) <Item_name> 
    <Use> -> (USE | use) <Item_name>

    <Item_name> -> String
    <Direction> -> ("north" | "south" | "east" | "west" | "N" | "S" | "E" | "W")
    <Obj> -> String */

    // Method to break user input into tokens
    public static ArrayList<Token> tokenize(String input) {
        
        // Creates ArrayList to store tokens
        ArrayList<Token> tokenList = new ArrayList<Token>();

        // Creates String array to store parts of user input
        String[] userCmd = input.split(" ");

        // Assign command token to variable
        Token cmdToken = assignCmdToken(userCmd[0]);

        // Add command token to tokenList
        tokenList.add(cmdToken);

        // Declare parameter token variable
        Token paramToken;

        // If command token is look, check formatting
        if (cmdToken == Token.LOOK) {

            // If lexeme is "at" or "AT", ignore and assign token for parameter of next lexeme
            if (2 < userCmd.length && (userCmd[1].equals("at") || userCmd[1].equals("AT"))) {

                paramToken = assignParamToken(cmdToken, userCmd[2]);

                // Add paramToken to tokenList
                tokenList.add(paramToken);

            }

            // Otherwise, assign token for parameter of current lexeme
            else if (1 < userCmd.length) {

                paramToken = assignParamToken(cmdToken, userCmd[1]);

                // Add paramToken to tokenList
                tokenList.add(paramToken);

            }

        }

        // Otherwise, assign token for parameter after command
        else if (1 < userCmd.length) {

            paramToken = assignParamToken(cmdToken, userCmd[1]);
            
            // Add paramToken to tokenList
            tokenList.add(paramToken);
        
        }

        // Add EOF token
        tokenList.add(Token.EOF);

        return tokenList;

    }

    // Method to assign token for command
    private static Token assignCmdToken(String lexeme) {

        // Declare token variable
        Token token;

        // Assign token for valid commands
        switch (lexeme) {

            case "LOOK", "look":
                token = Token.LOOK;
                break;

            case "MOVE", "move": 
                token = Token.MOVE;
                break;
                
            case "TAKE", "take": 
                token = Token.TAKE;
                break;

            case "USE", "use": 
                token = Token.USE;
                break;

            // If lexeme does not match valid commands, assign token with invalid
            default:
                token = Token.INVALID;
                break;
        }

        return token;

    }

    // Method to assign token for parameter
    private static Token assignParamToken(Token cmdToken, String lexeme) {

        // Initialize token variable with value of UNKNOWN (keeps value if no valid commands match)
        Token token = Token.UNKNOWN;

        // If command is look, assign token with value of OBJ
        if (cmdToken == Token.LOOK) {

            token = Token.OBJ;

        }

        // If command is move, check for valid directional input
        else if (cmdToken == Token.MOVE) {

            // If lexeme is "N", "S", "E", or "W" assign token with value of DIRECTION
            if (lexeme.equals("N") || lexeme.equals("S") || lexeme.equals("E") || lexeme.equals("W")) {

                token = Token.DIRECTION;

            }

            // Otherwise, if lexeme is "north", "south", "east", or "west", assign token with value of DIRECTION
            else if (lexeme.equals("north") || lexeme.equals("south") || lexeme.equals("east") || lexeme.equals("west")) {

                token = Token.DIRECTION;

            }

        }

        // If command is take, assign token with value of ITEM_NAME
        else if (cmdToken == Token.TAKE) {

            token = Token.ITEM_NAME;

        }

        // If command is use, assign token with value of ITEM_NAME
        else if (cmdToken == Token.USE) {

            token = Token.ITEM_NAME;

        }
        
        return token;

    }


}
