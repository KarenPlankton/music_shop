
import instruments.GuitarType;
import instruments.ModernAcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModernAcousticGuitarTest {

    ModernAcousticGuitar modernAcousticGuitar;

    @Before
    public void before() {
        modernAcousticGuitar = new ModernAcousticGuitar("hazel", " steel string", 6, 200.00 , 300.00,GuitarType.ACOUSTIC);
    }

    @Test
    public void hasColour() {
        assertEquals("hazel", modernAcousticGuitar.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals(" steel string", modernAcousticGuitar.getMaterial());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, modernAcousticGuitar.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, modernAcousticGuitar.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(200.00, modernAcousticGuitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(300.00, modernAcousticGuitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Tommy Emmanuel", modernAcousticGuitar.play());
    }

    @Test
    public void hasProfit() {
        assertEquals(100.00, modernAcousticGuitar.calculateMarkup(), 0.01);
    }
}

