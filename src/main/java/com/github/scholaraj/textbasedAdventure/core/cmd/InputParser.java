package com.github.scholaraj.textbasedAdventure.core.cmd;

import java.util.ArrayList;

public class InputParser {
    
    /* Class that parses player commands for validity */

    // Method to parse through a list of tokens
    public static boolean parse(ArrayList<Token> tokenList) {

        if (tokenList.size() > 3) {

            return false;

        }

        else if (tokenList.size() == 3) {

            Token cmdToken = tokenList.get(0);

            Token paramToken = tokenList.get(1);

            Token endToken = tokenList.get(2);

            if (cmdToken == Token.LOOK) {

                if (paramToken == Token.OBJ) {

                    if (endToken == Token.EOF) {
                        return true;
                    }

                    else {
                        return false;
                    }

                }

                else {
                    return false;
                }

            }

            else if (cmdToken == Token.MOVE) {

                if (paramToken == Token.DIRECTION) {

                    if (endToken == Token.EOF) {
                        return true;
                    }

                    else {
                        return false;
                    }

                }

                else {
                    return false;
                }

            }

            else if (cmdToken == Token.TAKE) {

                if (paramToken == Token.ITEM_NAME) {

                    if (endToken == Token.EOF) {
                        return true;
                    }

                    else {
                        return false;
                    }

                }

                else {
                    return false;
                }

            }

            else if (cmdToken == Token.USE) {

                if (paramToken == Token.ITEM_NAME) {

                    if (endToken == Token.EOF) {
                        return true;
                    }

                    else {
                        return false;
                    }

                }

                else {
                    return false;
                }

            }

        }

        return false;

    }

}
