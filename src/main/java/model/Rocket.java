package model;

import java.util.ArrayList;

public class Rocket implements Spaceship {

    int cost;
    int weight;
    int cargoWeight;
    ArrayList<Item> items;
    int maxWeight;
    double launchExplosion;
    double landingExplosion;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {

        if((item.weight+cargoWeight)<=maxWeight) {
            carry(item);
            return true;
        }
        return false;
    }

    public void carry(Item item) {
        items.add(item);
        cargoWeight = cargoWeight + item.weight;
    }


}
