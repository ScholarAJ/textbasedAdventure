package com.github.scholaraj.textbasedAdventure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import com.github.scholaraj.textbasedAdventure.core.cmd.InputLexer;
import com.github.scholaraj.textbasedAdventure.core.cmd.Token;

import java.util.ArrayList;

public class testLexer {

    /* Test class for InputLexer */
    
    // Variable for input String
    String input;

    // ArrayList to hold expected tokens
    ArrayList<Token> checkList;

    // Method to test valid commands
    @Test 
    void testValid() {

        // Block to test look command
        assertAll("Look cmd", 

            () -> {

                // Block to test look command with form "look at"
                assertAll("Look at", 

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "look at object";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");
                        
                    },

                    () -> {


                        checkList = new ArrayList<Token>();
                        
                        // Add expected tokens to checkList
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "LOOK at object";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");

                    },

                    () -> {


                        checkList = new ArrayList<Token>();
                        
                        // Add expected tokens to checkList
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "LOOK AT object";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");

                    },

                    () -> {


                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "look AT object";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");

                    }

                );

            },

            () -> {

                // Block to test look command with form "look"
                assertAll("Look", 

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "look object";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");
                        
                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "LOOK object";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");
                        
                    }

                );

            }

        );

        // Block to test move command
        assertAll("Move cmd", 

            () -> {

                // Block to test move command with parameters north or N
                assertAll("Move north", 

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move north";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE north";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move N";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE N";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }

                );

                // Block to test move command with parameters south or S
                assertAll("Move south", 

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move south";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE south";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move S";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE S";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }
                
                );

                // Block to test move command with parameters east or E
                assertAll("Move east", 


                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move east";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE east";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move E";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE E";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }

                );

                // Block to test move command with parameters west or W
                assertAll("Move west", 


                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move west";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE west";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "move W";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();

                        // Add expected tokens to checkList
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        // Add String to input
                        input = "MOVE W";

                        // Assertion for checking equality b/w ArrayLists
                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }

                );

            }

        );

        // Block to test take command
        assertAll("Take cmd", 

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.TAKE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                // Add String to input
                input = "TAKE item";

                // Assertion for checking equality b/w ArrayLists 
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be take command followed by item name");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.TAKE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                // Add String to input
                input = "take item";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be take command followed by item name");

            }

        );

        // Block to test use command
        assertAll("Use cmd", 

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.USE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                // Add String to input
                input = "USE item";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be use command followed by item name");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.USE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                // Add String to input
                input = "use item";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be take command followed by item name");

            }

        );
        
    }

    // Method to test invalid commands
    @Test 
    void testInvalid() {

        // Block to test look command
        assertAll("Look cmd",

            () -> {

                checkList = new ArrayList<Token>();
                
                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd";
        
                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.UNKNOWN);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd param";
        
                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid followed by unknown");

            }
        
        );
        
        // Block to test move command
        assertAll("Move cmd", 

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd";
        
                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.UNKNOWN);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd param";
        
                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid followed by unknown");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.MOVE);
                checkList.add(Token.UNKNOWN);
                checkList.add(Token.EOF);

                // Add String to input
                input = "move unknown";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be move command followed by unknown");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.MOVE);
                checkList.add(Token.UNKNOWN);
                checkList.add(Token.EOF);

                // Add String to input
                input = "MOVE unknown";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be move command followed by unknown");

            }

        );

        // Block to test take command
        assertAll("Take cmd", 

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.UNKNOWN);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd param";
        
                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid followed by unknown");

            }

        );

        // Block to test use command
        assertAll("Use cmd", 

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd";

                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid");

            },

            () -> {

                checkList = new ArrayList<Token>();

                // Add expected tokens to checkList
                checkList.add(Token.INVALID);
                checkList.add(Token.UNKNOWN);
                checkList.add(Token.EOF);

                // Add String to input
                input = "invCmd param";
        
                // Assertion for checking equality b/w ArrayLists
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid followed by unknown");

            }

        );

    }

}
