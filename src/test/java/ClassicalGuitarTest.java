import instruments.ClassicalGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import instruments.GuitarType;


public class ClassicalGuitarTest {

    ClassicalGuitar classicalGuitar;

    @Before
    public void before() {
       classicalGuitar = new ClassicalGuitar(" brown", "nylon strings", 6,GuitarType.ACOUSTIC);
    }

    @Test
    public void hasColour() {
        assertEquals(" brown", classicalGuitar.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("nylon strings", classicalGuitar.getMaterial());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, classicalGuitar.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, classicalGuitar.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Bourrée in E minor – Bach", classicalGuitar.play());
    }

}
