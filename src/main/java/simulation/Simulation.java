package simulation;

import model.Item;
import model.U1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Simulation {

    ArrayList<Item> itemArrayList= new ArrayList(10);
    String pathDirPhase1 = "/Users/trevortabaka/Documents/CodingNomads/space_sim/src/main/resources/phase-1.txt";
    String pathDirPhase2 = "/Users/trevortabaka/Documents/CodingNomads/space_sim/src/main/resources/phase-2.txt";

    public ArrayList<Item> loadItems(String phaseDir){

        try(BufferedReader input = new BufferedReader(new FileReader(phaseDir))) {

            String dataLine = null;
            while((dataLine = input.readLine()) != null){
                Item item = new Item();
                String[] itemParams = dataLine.split("=");
                item.setName(itemParams[0]);
                item.setWeight(Integer.parseInt(itemParams[1]));
                itemArrayList.add(item);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemArrayList;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> itemsArrayList){

        ArrayList<Item> itemsU1 = itemsArrayList;
        ArrayList<Item> SortedItemsArrayList = itemBubbleSort(itemsArrayList);
        ArrayList<U1> u1RocketFleet = new ArrayList();
        ArrayList<Item> remainingItems = new ArrayList<>();
        U1 u1Rocket;
        int loopCount=0;
        do {
            if(loopCount !=0){
                SortedItemsArrayList = remainingItems;
            }
            remainingItems = new ArrayList<Item>();
            u1Rocket = new U1("U1_" + U1.getU1Count());
            for (Item item : SortedItemsArrayList) {
                if (u1Rocket.canCarry(item)) {
                    u1Rocket.carry(item);

                } else {
                    remainingItems.add(item);
                    System.out.println("Added uncarriable " + item.getName() + " to the remainingItems array");
                }
            }
            loopCount++;
            u1RocketFleet.add(u1Rocket);
        }while(remainingItems.size() != 0);

        System.out.println(u1RocketFleet.toString());
        System.out.println("U1 rocket fleet is " + u1RocketFleet.size() + " rockets in total");






        return null;
    }

    public static ArrayList<Item> itemBubbleSort(ArrayList<Item> itemArrayList){

        for(int i = 0; i < itemArrayList.size(); i++){

            for(int j=1; j < itemArrayList.size()-i; j++){

                if(itemArrayList.get(j-1).getWeight() < itemArrayList.get(j).getWeight()){
                    Collections.swap(itemArrayList, j-1, j);
                }
            }
        }
        return itemArrayList;
    }
}
