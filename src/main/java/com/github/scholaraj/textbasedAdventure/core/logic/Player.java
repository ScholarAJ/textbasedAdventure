package com.github.scholaraj.textbasedAdventure.core.logic;

import java.util.ArrayList;

// Class representing player object
public class Player {

    private String playerName;
    private Room lastRoom;
    private ArrayList<Item> playerInv;

    public Player(String name, ArrayList<Item> inventory, Room startRoom) {

        playerName = name;
        playerInv = inventory;
        lastRoom = startRoom;

    }

    public Player(String name, Room startRoom) {

        playerName = name;
        playerInv = new ArrayList<Item>();
        lastRoom = startRoom;

    }

    public String getName() {
        return playerName;
    }

    public Room getLastRoom() {
        return lastRoom;
    }

    public void setLastRoom(Room newRoom) {
        lastRoom = newRoom;
    }

    public ArrayList<Room> getInv() {

    }

    public void addItem(Item item) {
        playerInv.add(item);
    }

    public Item removeItem(String itemName) {
        
        Item removedItem = null;

        

        return removedItem;

    }

}
