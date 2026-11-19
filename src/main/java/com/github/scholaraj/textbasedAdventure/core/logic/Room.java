package com.github.scholaraj.textbasedAdventure.core.logic;

import java.util.ArrayList;

// Class representing room object
public class Room {

    // Name of room
    private String roomName;
    // Description of room
    private String roomDesc;

    // Environment of room (stores entities)
    private ArrayList<Obj> roomEnv;
    // Inventory of room (stores items)
    private ArrayList<Item> roomInv;

    // Variables for adjacent rooms 
    private Room northAdj;
    private Room southAdj;
    private Room eastAdj;
    private Room westAdj;

    public Room(String name, String desc, ArrayList<Obj> environment, ArrayList<Item> inventory) {

        roomName = name;
        roomDesc = desc;

        roomEnv = environment;
        roomInv = inventory;

    }

    // Getter for roomNate
    public String getRoomName() {
        return roomName;
    }

    // Getter for roomDesc
    public String getRoomDesc() {
        return roomDesc;
    } 

    /* Getter for roomInv 
    Returns copy of ArrayList */
    public ArrayList<Item> getRoomInv() {

        ArrayList<Item> copyInv = new ArrayList<Item>();

        copyInv.addAll(roomInv);

        return copyInv;

    }

    // Method to add item to roomInv
    public void addRoomItem(Item item) {
        roomInv.add(item);
    }

    // Method to remove item from roomInv
    public Item removeRoomItem(String itemName) {
        
        Item removedItem = null;

        for (int i = 0; i < roomInv.size(); i++) {

            Item currItem = roomInv.get(i);

            if (currItem.getName() == itemName) {
                roomInv.remove(i);
                removedItem = currItem;
            }

        }

        return removedItem;

    }

    /* Getter for roomEnv 
    Returns copy of ArrayList */
    public ArrayList<Obj> getRoomEnv() {

        ArrayList<Obj> copyEnv = new ArrayList<Obj>();

        copyEnv.addAll(roomEnv);

        return copyEnv;

    }

    // Method to add obj to roomEnv
    public void addRoomObj(Obj obj) {
        roomEnv.add(obj);
    }

    // Method to remove obj from roomEnv
    public Obj removeRoomObj(String objName) {
        
        Obj removedObj = null;

        for (int i = 0; i < roomEnv.size(); i++) {

            Obj currObj = roomEnv.get(i);

            if (currObj.getName() == objName) {
                roomEnv.remove(i);
                removedObj = currObj;
            }

        }

        return removedObj;

    }

    // Getter for northAdj
    public Room getNorth() {
        return northAdj;
    }

    // Setter for northAdj
    public void setNorth(Room northRoom) {
        northAdj = northRoom;
    }

    // Getter for southAdj
    public Room getSouth() {
        return southAdj;
    }

    // Setter for southAdj
    public void setSouth(Room southRoom) {
        southAdj = southRoom;
    }

    // Getter for eastAdj
    public Room getEast() {
        return eastAdj;
    }

    // Setter for eastAdj
    public void setEast(Room eastRoom) {
        eastAdj = eastRoom;
    }

    // Getter for westAdj
    public Room getWest() {
        return westAdj;
    }

    // Setter for westAdj
    public void setWest(Room westRoom) {
        westAdj = westRoom;
    }

}
