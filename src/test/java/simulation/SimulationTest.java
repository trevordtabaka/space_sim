package simulation;
import org.junit.Before;
import simulation.Simulation;
import model.Item;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class SimulationTest {
    @Before
    public void setUp() throws Exception {
        Simulation testSim = new Simulation();
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

}