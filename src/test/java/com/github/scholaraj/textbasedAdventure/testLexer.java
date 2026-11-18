package com.github.scholaraj.textbasedAdventure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import com.github.scholaraj.textbasedAdventure.core.cmd.InputLexer;
import com.github.scholaraj.textbasedAdventure.core.cmd.Token;

import java.util.ArrayList;

public class testLexer {
    
    String input;
    ArrayList<Token> checkList;

    @Test 
    void testValid() {

        assertAll("Look cmd", 

            () -> {

                assertAll("Look at", 

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        input = "look at object";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");
                        
                    },

                    () -> {


                        checkList = new ArrayList<Token>();
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        input = "LOOK at object";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");

                    },

                    () -> {


                        checkList = new ArrayList<Token>();
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        input = "LOOK AT object";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");

                    },

                    () -> {


                        checkList = new ArrayList<Token>();
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        input = "look AT object";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");

                    }

                );

            },

            () -> {

                assertAll("Look", 

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        input = "look object";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");
                        
                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.LOOK);
                        checkList.add(Token.OBJ);
                        checkList.add(Token.EOF);

                        input = "LOOK object";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be look command followed by object");
                        
                    }

                );

            }

        );

        assertAll("Move cmd", 

            () -> {

                assertAll("Move north", 

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move north";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE north";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move N";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE N";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }

                );

                assertAll("Move south", 

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move south";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE south";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move S";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE S";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }
                
                );

                assertAll("Move east", 


                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move east";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE east";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move E";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE E";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }

                );

                assertAll("Move west", 


                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move west";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE west";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "move W";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    },

                    () -> {

                        checkList = new ArrayList<Token>();
                        checkList.add(Token.MOVE);
                        checkList.add(Token.DIRECTION);
                        checkList.add(Token.EOF);

                        input = "MOVE W";

                        assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be move command followed by direction");

                    }

                );

            }

        );

        assertAll("Take cmd", 

            () -> {

                checkList = new ArrayList<Token>();
                checkList.add(Token.TAKE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                input = "TAKE item";

                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be take command followed by item name");

            },

            () -> {

                checkList = new ArrayList<Token>();
                checkList.add(Token.TAKE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                input = "take item";

                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be take command followed by item name");

            }

        );

        assertAll("Use cmd", 

            () -> {

                checkList = new ArrayList<Token>();
                checkList.add(Token.USE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                input = "USE item";

                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be use command followed by item name");

            },

            () -> {

                checkList = new ArrayList<Token>();
                checkList.add(Token.USE);
                checkList.add(Token.ITEM_NAME);
                checkList.add(Token.EOF);

                input = "use item";

                assertIterableEquals(checkList, InputLexer.tokenize(input), "Tokens for \"" + input + "\" should be take command followed by item name");

            }

        );
        
    }

    @Test 
    void testInvalid() {

        assertAll("Look cmd",

            () -> {

                checkList = new ArrayList<>();
                checkList.add(Token.INVALID);

                input = "invCmd";
        
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid");

            },

            () -> {

                checkList = new ArrayList<>();
                checkList.add(Token.INVALID);
                checkList.add(Token.UNKNOWN);

                input = "invCmd param";
        
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid followed by unknown");

            }
        
        );
        
        assertAll("Move cmd", 

            () -> {

                checkList = new ArrayList<>();
                checkList.add(Token.INVALID);

                input = "invCmd";
        
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid");

            },

            () -> {

                checkList = new ArrayList<>();
                checkList.add(Token.INVALID);
                checkList.add(Token.UNKNOWN);

                input = "invCmd param";
        
                assertIterableEquals(checkList, InputLexer.tokenize(input), "Token for \"" + input + "\" should be invalid followed by unknown");

            }

        );

        assertAll("Take cmd");

        assertAll("Use cmd");

    }

}
