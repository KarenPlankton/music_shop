import instruments.PiccoloTrumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiccoloTrumpetTest {

    PiccoloTrumpet piccoloTrumpet;

    @Before
    public void before() {
        piccoloTrumpet = new PiccoloTrumpet("gold", "brass", 3, 400.00, 800.00);
    }

    @Test
    public void hasColour() {
        assertEquals("gold", piccoloTrumpet.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("brass", piccoloTrumpet.getMaterial());
    }

    @Test
    public void getNumberOfValves() {
        assertEquals(3, piccoloTrumpet.getNumberOfValves());
    }


    @Test
    public void hasBuyPrice() {
        assertEquals(400.00, piccoloTrumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(800.00, piccoloTrumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Second Brandenburg Concerto", piccoloTrumpet.play());
    }

    @Test
    public void canCalculate() {
        assertEquals(400.00, piccoloTrumpet.calculateMarkup(), 0.01);
    }
}