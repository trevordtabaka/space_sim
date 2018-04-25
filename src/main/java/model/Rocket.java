package model;

import java.util.ArrayList;

public class Rocket implements Spaceship {

    private int cost;
    private int weight;
    private int cargoWeight = 0;
    private ArrayList<Item> items= new ArrayList<Item>(10);
    private int maxWeight;
    private double launchExplosionFactor;
    private double landingExplosionFactor;


    public Rocket(int cost, int weight, ArrayList<Item> items, int maxWeight, double launchExplosionFactor, double landingExplosionFactor) {
        this.cost = cost;
        this.weight = weight;
        setItems(items);
        this.maxWeight = maxWeight;
        this.launchExplosionFactor = launchExplosionFactor;
        this.landingExplosionFactor = landingExplosionFactor;
    }

    public Rocket(int cost, int weight, int maxWeight, double launchExplosionFactor, double landingExplosionFactor) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.launchExplosionFactor = launchExplosionFactor;
        this.landingExplosionFactor = landingExplosionFactor;
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        int totalWeight = item.weight+cargoWeight+weight;
        if(totalWeight<=maxWeight) {
            return true;
        }
        return false;
    }

    public void carry(Item item) {
        items.add(item);
        cargoWeight = cargoWeight + item.weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getLaunchExplosionFactor() {
        return launchExplosionFactor;
    }

    public void setLaunchExplosionFactor(double launchExplosionFactor) {
        this.launchExplosionFactor = launchExplosionFactor;
    }

    public double getLandingExplosionFactor() {
        return landingExplosionFactor;
    }

    public void setLandingExplosionFactor(double landingExplosionFactor) {
        this.landingExplosionFactor = landingExplosionFactor;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {

        for (Item i : items) {
            if (canCarry(i))
                carry(i);
            else {
                System.out.println(i.name + " was not able to be loaded. " +
                        "The available weight remaining is " + (maxWeight - (getCargoWeight() + weight)
                        + " and the item weighs " + i.weight)
                );
            }

        }
    }
}
