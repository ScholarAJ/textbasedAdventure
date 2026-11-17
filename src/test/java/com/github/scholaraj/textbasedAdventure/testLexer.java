package com.github.scholaraj.textbasedAdventure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.scholaraj.textbasedAdventure.core.cmd.InputLexer;
import com.github.scholaraj.textbasedAdventure.core.cmd.Token;

import java.util.ArrayList;

public class testLexer {
    
    String input;
    ArrayList<Token> checkList;

    @Test 
    void testValid() {

        assertAll("Look cmd");

        assertAll("Move cmd");

        assertAll("Take cmd");

        assertAll("Use cmd");
        
    }

    @Test 
    void testInvalid() {



    }

}
