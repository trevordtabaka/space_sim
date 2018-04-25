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

    /**
     * launch method creates a number using the randomNumberGenerator method between 1 and 100 and multiplies this by
     * the launchExplosionFactor variable. This number is then compare to another randomly generated number between 1-100
     * and if the number with the explosionFactor is less than the pure random number then the launch is successful
     * and returns true. If not, the launch failed, exploded, and returns false.
     *
     * @return
     */
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

    /**
     * land method creates a number using the randomNumberGenerator method between 1 and 100 and multiplies this by
     * the landExplosionFactor variable. This number is then compare to another randomly generated number between 1-100
     * and if the number with the explosionFactor is less than the pure random number then the landing is successful
     * and returns true. If not, the landing failed, exploded, and returns false.
     * @return
     */
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
