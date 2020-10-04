
import instruments.MusicBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicBookTest {

    MusicBook book;

    @Before
    public void before() {
        book = new MusicBook("The Six Chord Songbook",3.0,5.0);
    }

    @Test
    public void hasTitle() {
        assertEquals("The Six Chord Songbook", book.getTitle());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(3.0, book.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(5.0, book.getSellPrice(),0.01);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(2.0, book.calculateMarkup(),0.01);
    }
}