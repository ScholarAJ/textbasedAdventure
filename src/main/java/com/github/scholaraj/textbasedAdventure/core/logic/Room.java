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

    public Room(String name, String desc, ArrayList<Obj> environment, ArrayList<Item> inventory) {

        roomName = name;
        roomDesc = desc;

        roomEnv = environment;
        roomInv = inventory;

    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    } 

    public ArrayList<Item> getRoomInv() {

        ArrayList<Item> copyInv = new ArrayList<Item>();

        copyInv.addAll(roomInv);

        return copyInv;

    }

    public void addRoomItem(Item item) {
        roomInv.add(item);
    }

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

    public ArrayList<Obj> getRoomEnv() {

        ArrayList<Obj> copyEnv = new ArrayList<Obj>();

        copyEnv.addAll(roomEnv);

        return copyEnv;

    }

    public void addRoomObj(Obj obj) {
        roomEnv.add(obj);
    }

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

    public Room getNorth() {
        return northAdj;
    }

    public void setNorth(Room northRoom) {
        northAdj = northRoom;
    }

    public Room getSouth() {
        return southAdj;
    }

    public void setSouth(Room southRoom) {
        southAdj = southRoom;
    }

    public Room getEast() {
        return eastAdj;
    }

    public void setEast(Room eastRoom) {
        eastAdj = eastRoom;
    }

    public Room getWest() {
        return westAdj;
    }

    public void setWest(Room westRoom) {
        westAdj = westRoom;
    }
    

}
