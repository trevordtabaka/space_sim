package model;

import java.util.ArrayList;

public class U1 extends Rocket {

//    int cost = 100000000;
//    int weight = 10000;
//    int maxWeight = 18000;
//    ArrayList<Item> items;
//    double launchExplosionFactor = .05;
//    double landingExplosionFactor = .01;



    public U1(ArrayList<Item> items) {
        super(100000000, 10000, items, 18000, .05, .01);
    }

    public U1() {
        super(100000000, 10000, 18000, .05, .01);
    }

    @Override
    public boolean launch() {
        return super.launch();
    }

    @Override
    public boolean land() {
        return super.land();
    }
}