import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);

    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.volume());
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.volume());
    }

    @Test
    public void canEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.volume());
    }

    @Test
    public void canFill(){
        waterBottle = new WaterBottle(50);
        waterBottle.fill();
        assertEquals(100, waterBottle.volume());
    }
}
