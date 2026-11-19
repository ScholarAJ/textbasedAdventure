package com.github.scholaraj.textbasedAdventure.core.logic;

// Class representing entity in game (enemy or background object)
public class Obj {

    private String objName;
    private String objDesc;
    private String objType;
    
    public Obj(String name, String desc, String type) {

        objName = name;
        objDesc = desc;
        objType = type;

    }

    public String getName() {
        return objName;
    } 

    public String getDesc() {
        return objDesc;
    }

    public String getType() {
        return objType;
    }

}
