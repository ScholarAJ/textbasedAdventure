package com.github.scholaraj.textbasedAdventure.core.logic;

import java.util.ArrayList;

// Class representing player object
public class Player {

    // Player's name
    private String playerName;
    // Last room player was in
    private Room lastRoom;
    // Player's inventory 
    private ArrayList<Item> playerInv;

    // Constructor for player with specified inventory
    public Player(String name, ArrayList<Item> inventory, Room startRoom) {

        playerName = name;
        playerInv = inventory;
        lastRoom = startRoom;

    }

    // Constructor for player with empty inventory
    public Player(String name, Room startRoom) {

        playerName = name;
        playerInv = new ArrayList<Item>();
        lastRoom = startRoom;

    }

    // Getter for playerName
    public String getName() {
        return playerName;
    }

    // Getter for lastRoom
    public Room getLastRoom() {
        return lastRoom;
    }

    // Setter for lastRoom
    public void setLastRoom(Room newRoom) {
        lastRoom = newRoom;
    }

    /* Getter for playerInv 
    Returns copy of ArrayList */
    public ArrayList<Item> getInv() {

        ArrayList<Item> copyInv = new ArrayList<Item>();

        copyInv.addAll(playerInv);

        return copyInv;

    }

    // Method to add item to playerInv
    public void addItem(Item item) {
        playerInv.add(item);
    }

    // Method to remove item from playerInv
    public Item removeItem(String itemName) {
        
        Item removedItem = null;

        for (int i = 0; i < playerInv.size(); i++) {

            Item currItem = playerInv.get(i);

            if (currItem.getName() == itemName) {
                playerInv.remove(i);
                removedItem = currItem;
            }

        }

        return removedItem;

    }

}
