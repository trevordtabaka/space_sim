package model;

import java.util.ArrayList;

public class U2 extends Rocket {

//    int cost = 120000000;
//    int weight = 18000;
//    int maxWeight = 29000;
//    ArrayList<Item> items;
//    double launchExplosionFactor = .04;
//    double landingExplosionFactor = .08;



    public U2(ArrayList<Item> items) {
        super(100000000, 10000, items, 18000, .05, .01);
    }

    public U2() {
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
