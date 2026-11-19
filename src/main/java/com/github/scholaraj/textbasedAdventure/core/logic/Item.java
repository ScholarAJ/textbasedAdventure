package com.github.scholaraj.textbasedAdventure.core.logic;

// Class representing item object
public class Item {

    private String itemName;
    private String itemDesc; 

    public Item(String name, String desc) {

        itemName = name;
        itemDesc = desc;

    }

    public String getName() {
        return itemName;
    }

    public String getDesc() {
        return itemDesc;
    }


}
