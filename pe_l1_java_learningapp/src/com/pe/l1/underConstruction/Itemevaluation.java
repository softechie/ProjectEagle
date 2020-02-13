package com.pe.l1.underConstruction;

/**
 *
 */
public class Itemevaluation {
    public static void main (String[] args){
        Item item1 = new Item ();
        Item item2 = new Item ();

        item1.itemID=1234;
        item2.itemID=4567;

        item1 = item2;

        System.out.println("Item ID of item 1 "+ item1.itemID);
    }
}
