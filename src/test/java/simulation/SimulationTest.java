package simulation;
import org.junit.Before;
import simulation.Simulation;
import model.Item;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class SimulationTest {
    Simulation simulation = new Simulation();

    ArrayList<Item> itemArrayList;

    @Before
    public void setUp() throws Exception {
        Simulation testSim = new Simulation();
        Item item1 = new Item("food", 4000);
        Item item2 = new Item("food2", 500);
        Item item3 = new Item("water", 2000);
        Item item4 = new Item("trees", 6000);
        Item item5 = new Item("dirt", 1000);
        Item item6 = new Item("minerals", 5000);

        itemArrayList = new ArrayList<Item>(6);
        itemArrayList.add(item1);
        itemArrayList.add(item2);
        itemArrayList.add(item3);
        itemArrayList.add(item4);
        itemArrayList.add(item5);
        itemArrayList.add(item6);
    }

    @Test
    public void loadItemsTest(){
        Simulation testSim = new Simulation();
        ArrayList<Item> testArrayList;
        testArrayList=testSim.loadItems(testSim.pathDirPhase1);
        assertEquals(testArrayList.get(0).getName(), "building tools");
        assertEquals(testArrayList.get(0).getWeight(), 2000);
        assertEquals(testArrayList.get(14).getName(), "water");
        assertEquals(testArrayList.get(14).getWeight(), 5000);
    }

    @Test
    public void itemBubbleSort(){

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

        assertEquals("trees", simulation.itemBubbleSort(itemArrayList).get(0).getName());
        assertEquals("food2", simulation.itemBubbleSort(itemArrayList).get(5).getName());
    }

}