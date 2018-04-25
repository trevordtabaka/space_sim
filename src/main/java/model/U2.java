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


        double probability = getLaunchExplosionFactor()*((getCargoWeight()+getWeight())/getMaxWeight());
        if(randomNumberGenerator(100) >= (randomNumberGenerator(100) * probability)){
            System.out.println("Successful Launch!!!");
            return true;
        }else{

            System.out.println("Launching has failed..Boom");
            return false;                                                                                   }
    }
    @Override
    public boolean land() {
        double probability = getLandingExplosionFactor()*((getCargoWeight()+getWeight())/getMaxWeight());
        if(randomNumberGenerator(100) >= (randomNumberGenerator(100) * probability)){
            System.out.println("Successful Landing!!!");
            return true;
        }else{

            System.out.println("Landing has failed..Boom");
            return false;
        }
    }
    private int randomNumberGenerator(int max) {
        int random = (int) (Math.random() * max + 1);
        return random;
    }
}
