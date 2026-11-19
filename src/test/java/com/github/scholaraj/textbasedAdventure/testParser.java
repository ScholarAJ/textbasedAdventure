package com.github.scholaraj.textbasedAdventure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.github.scholaraj.textbasedAdventure.core.cmd.InputParser;
import com.github.scholaraj.textbasedAdventure.core.cmd.Token;

import java.util.ArrayList;

public class testParser {
    
    /* Test class for inputParser */

    // Variable for input String
    String input;

    // ArrayList to hold command tokens
    ArrayList<Token> comList;

    // Method to test valid commands
    @Test 
    void testValid() {

        // Valid input for look command
        assertAll("Look cmd",

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.LOOK);
                comList.add(Token.OBJ);
                comList.add(Token.EOF);

                assertTrue(InputParser.parse(comList));

            }

        );

        // Valid input for move command
        assertAll("Move cmd", 

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.MOVE);
                comList.add(Token.DIRECTION);
                comList.add(Token.EOF);

                assertTrue(InputParser.parse(comList));

            }

        );

        // Valid input for take command
        assertAll("Take cmd", 

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.TAKE);
                comList.add(Token.ITEM_NAME);
                comList.add(Token.EOF);

                assertTrue(InputParser.parse(comList));


            }

        );

        // Valid input for use command
        assertAll("Use cmd", 

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.USE);
                comList.add(Token.ITEM_NAME);
                comList.add(Token.EOF);

                assertTrue(InputParser.parse(comList));

            }

        );

    }

    // Method to test invalid commands
    @Test 
    void testInvalid() {

        // Invalid or incomplete commands
        assertAll("Invalid cmd", 

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.INVALID);
                comList.add(Token.EOF);

                assertFalse(InputParser.parse(comList));

            },

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.INVALID);
                comList.add(Token.UNKNOWN);
                comList.add(Token.EOF);

                assertFalse(InputParser.parse(comList));

            },

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.MOVE);
                comList.add(Token.UNKNOWN);
                comList.add(Token.EOF);

                assertFalse(InputParser.parse(comList));

            },

            () -> {

                comList = new ArrayList<Token>();

                comList.add(Token.LOOK);
                comList.add(Token.EOF);

                assertFalse(InputParser.parse(comList));

            }

        );

    }

}
