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
    private int randomNumberGenerator(int max){
        int random = (int )(Math.random() * max + 1);
        return random;
    }
}
