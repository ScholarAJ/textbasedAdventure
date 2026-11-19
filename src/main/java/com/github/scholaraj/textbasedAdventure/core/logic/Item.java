package com.github.scholaraj.textbasedAdventure.core.logic;

// Class representing item object
public class Item {

    // Item's name
    private String itemName;
    // Item's description
    private String itemDesc; 

    public Item(String name, String desc) {

        itemName = name;
        itemDesc = desc;

    }

    // Getter for itemName
    public String getName() {
        return itemName;
    }

    // Getter for itemDesc
    public String getDesc() {
        return itemDesc;
    }


}
