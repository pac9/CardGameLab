import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;


  @Before
  public void before(){

      deck = new Deck();

  }

  @Test
    public void deckStarts52Cards(){

      assertEquals(52, deck.noOfCards() );
  }

}
