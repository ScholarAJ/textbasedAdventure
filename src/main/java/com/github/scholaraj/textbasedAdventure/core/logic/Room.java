package com.github.scholaraj.textbasedAdventure.core.logic;

import java.util.ArrayList;


// Class representing room object
public class Room {

    private String roomName;
    private String roomDesc;

    private ArrayList<Obj> roomEnv;
    private ArrayList<Item> roomInv;

    private Room northAdj;
    private Room southAdj;
    private Room eastAdj;
    private Room westAdj;

    public Room() {

        

    }
    

}
