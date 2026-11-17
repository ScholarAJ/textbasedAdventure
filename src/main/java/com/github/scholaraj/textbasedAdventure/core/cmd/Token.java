package com.github.scholaraj.textbasedAdventure.core.cmd;

public enum Token {

    // Command types
    LOOK, MOVE, TAKE, USE,
    
    // Extra parameters
    ITEM_NAME, OBJ, DIRECTION,

    // Specifies illegal command
    INVALID,

    // Specifies unknown parameter
    UNKNOWN,

    // Signifies end of input
    EOF

}
