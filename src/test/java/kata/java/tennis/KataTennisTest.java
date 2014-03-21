package kata.java.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTennisTest {

	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		TennisGame tennisGame = new TennisGame("Player A", "Player B");
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}

}
