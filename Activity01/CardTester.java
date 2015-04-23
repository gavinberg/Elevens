package Activity01;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTester.
 *
 * @author  (Gavin Berg)
 * @version (a version number or a date)
 */
public class CardTester
{
    Card card1 = new Card("Queen","Hearts", 12);
    Card card2 = new Card("King", "Diamonds", 13);
    Card card3 = new Card("Jack", "Spades", 11);
    /**
     * Default constructor for test class CardTester
     */
    public CardTester()
    {
      
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testRank()
    {
        assertEquals("Queen", card1.rank());
        assertEquals("King", card2.rank());
        assertEquals("Jack", card3.rank());
    }
    
    @Test
    public void testSuit()
    {
        assertEquals("Hearts", card1.suit());
        assertEquals("Diamonds", card2.suit());
        assertEquals("Spades", card3.suit());
    }
    
    @Test
    public void testPointValue()
    {
        assertEquals(12, card1.pointValue());
        assertEquals(13, card2.pointValue());
        assertEquals(11, card3.pointValue());
    }
    
    @Test
    public void testMatches()
    {
        assertFalse(card1.matches(card2));
        assertFalse(card2.matches(card3));
        assertFalse(card3.matches(card1));
    }
    
    @Test
    public void testToString()
    {
        assertEquals("Queen of Hearts (point value = 12)", card1.toString());
        assertEquals("King of Diamonds (point value = 13)", card2.toString());
        assertEquals("Jack of Spades (point value = 11)", card3.toString());
    }
}