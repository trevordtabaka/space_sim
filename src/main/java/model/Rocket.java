package model;

import java.util.ArrayList;

/**
 * The Rocket class
 *
 */
public class Rocket implements Spaceship {
    private String name;
    private int cost;
    private int weight;
    private int cargoWeight = 0;
    private ArrayList<Item> items= new ArrayList<Item>(10);
    private int maxWeight;
    private double launchExplosionFactor;
    private double landingExplosionFactor;


    public Rocket(String name, int cost, int weight, ArrayList<Item> items, int maxWeight, double launchExplosionFactor, double landingExplosionFactor) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        setItems(items);
        this.maxWeight = maxWeight;
        this.launchExplosionFactor = launchExplosionFactor;
        this.landingExplosionFactor = landingExplosionFactor;
    }

    public Rocket(String name,int cost, int weight, int maxWeight, double launchExplosionFactor, double landingExplosionFactor) {

        this.name = name;
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

    /**
     * canCarry method takes in an Item object and checks if there is enough weight capacity remaining in the Rocket
     * object. If so, it returns true. If not, false is returned.
     * @param item
     * @return
     */
    public boolean canCarry(Item item) {
        int totalWeight = item.getWeight()+cargoWeight+weight;
        if(totalWeight<=maxWeight) {
            System.out.println("Able to carry "+ item.getName());
            return true;
        }
        System.out.println("Unable to carry "+ item.getName());

        return false;
    }

    /**
     * carry method takes in an Item object and adds it to the Items ArrayList and updates the cargoWeight member
     * @param item
     */
    public void carry(Item item) {
        items.add(item);
        cargoWeight = cargoWeight + item.getWeight();
        System.out.println("Now carrying " + item.getName() + " and total weight is " + (cargoWeight + weight));
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

    /**
     *  setItems()
     * @param items
     * Takes in an arraylist of type Item. One by one sends an Item object to canCarry
     * to see if the Rocket object has enough weight holding capacity available still. If it does it calls the carry() method
     * to add the item to the Item arraylist. If not you get a message reporting that it wasn't with the situation
     * around the weight availability.
     *
     */
    public void setItems(ArrayList<Item> items) {

        for (Item i : items) {
            if (canCarry(i))
                carry(i);
            else {
                System.out.println(i.getName() + " was not able to be loaded. " +
                        "The available weight remaining is " + (maxWeight - (getCargoWeight() + weight)
                        + " and the item weighs " + i.getWeight())
                );
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", cargoWeight=" + cargoWeight +
                ", items=" + items +
                ", maxWeight=" + maxWeight +
                ", launchExplosionFactor=" + launchExplosionFactor +
                ", landingExplosionFactor=" + landingExplosionFactor +
                '}';
    }
}
