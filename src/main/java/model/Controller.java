package model;

import simulation.Simulation;

import java.util.ArrayList;

import static simulation.Simulation.itemBubbleSort;

public class Controller {

    public static void main2(String[] args) {
        U1 obj = new U1("name");
        Item item1 = new Item("food", 9000);
        Item item2 = new Item("food2", 7000);

        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        itemArrayList.add(item1);
        itemArrayList.add(item2);

        obj.setItems(itemArrayList);

    }
    public static void main(String[] args) {
        Item item1 = new Item("food", 4000);
        Item item2 = new Item("food2", 500);
        Item item3 = new Item("water", 2000);
        Item item4 = new Item("trees", 6000);
        Item item5 = new Item("dirt", 1000);
        Item item6 = new Item("minerals", 5000);

        ArrayList<Item> itemArrayList = new ArrayList<Item>(6);
        itemArrayList.add(item1);
        itemArrayList.add(item2);
        itemArrayList.add(item3);
        itemArrayList.add(item4);
        itemArrayList.add(item5);
        itemArrayList.add(item6);

        Simulation simulation = new Simulation();
        simulation.loadU1(itemArrayList);
        itemArrayList = itemBubbleSort(itemArrayList);


        for (Item i : itemArrayList){
            System.out.println(i.getName() + " & " + i.getWeight());
        }
        System.out.println("done");
    }
}
