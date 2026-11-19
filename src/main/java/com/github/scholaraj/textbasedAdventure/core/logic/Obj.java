package com.github.scholaraj.textbasedAdventure.core.logic;

// Class representing entity in game (enemy or background object)
public class Obj {

    // Name of entity
    private String objName;
    // Description of entity
    private String objDesc;
    // Type of entity (enemy or BG object)
    private String objType;
    
    public Obj(String name, String desc, String type) {

        objName = name;
        objDesc = desc;
        objType = type;

    }

    // Getter for objName
    public String getName() {
        return objName;
    } 

    // Getter for objDesc
    public String getDesc() {
        return objDesc;
    }

    // Getter for objType
    public String getType() {
        return objType;
    }

}
