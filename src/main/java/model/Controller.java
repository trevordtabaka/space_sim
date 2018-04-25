package model;

import java.util.ArrayList;

public class Controller {

    public static void main(String[] args) {
        U1 obj = new U1();
        Item item1 = new Item("food", 9000);
        Item item2 = new Item("food2", 7000);

        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        itemArrayList.add(item1);
        itemArrayList.add(item2);

        obj.setItems(itemArrayList);

    }
}
