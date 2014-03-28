package kata.java.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTennisTest {

	TennisGame tennisGame = new TennisGame("Player A", "Player B");

	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}

	@Test
	public void playerAWinFirstBallShouldReturnFifteenLove() throws Exception {
		tennisGame.playerScore(15, 0);
		String score = tennisGame.getScore();
		assertEquals("Fifteen Love", score);
	}

	@Test
	public void bothPlayerDrawWithFifteenShouldReturnFifteenAll() throws Exception {
		tennisGame.playerScore(15, 0);
		tennisGame.playerScore(0, 15);
		String score = tennisGame.getScore();
		assertEquals("Fifteen all", score);
	}

	@Test
	public void playerBWinInFirstBallShouldReturnLoveFifteen() throws Exception {
		tennisGame.playerScore(0, 15);
		String score = tennisGame.getScore();
		assertEquals("Love Fifteen", score);
	}

	@Test
	public void playerAWinFirstTwoBallShouldReturnThirtyLove() throws Exception {
		tennisGame.playerScore(30, 0);
		String score = tennisGame.getScore();
		assertEquals("Thirty Love", score);
	}

	@Test
	public void playerAWinFirstThreeBallShouldReturnFortyLove() throws Exception {
		tennisGame.playerScore(40, 0);
		String score = tennisGame.getScore();
		assertEquals("Forty Love", score);
	}

	@Test
	public void playerAWinFirstFourBallShouldReturnWinForPlayerA() throws Exception {
		tennisGame.playerScore(50, 0);
		String score = tennisGame.getScore();
		assertEquals("Win For Player A", score);
	}

	@Test
	public void bothPlayerDrawWithFortyShouldReturnDuce() throws Exception {
		tennisGame.playerScore(40, 40);
		String score = tennisGame.getScore();
		assertEquals("Deuce", score);
	}

	@Test
	public void playerBWinFirstFourBallShouldReturnWinForPlayerB() throws Exception {
		tennisGame.playerScore(0, 50);
		String score = tennisGame.getScore();
		assertEquals("Win For Player B", score);
	}

	@Test
	public void playerAWinOneBallAfterDeuceShouldReturnAdvantagePlayerA() throws Exception {
        tennisGame.playerScore(50,40);
        String score = tennisGame.getScore();
        assertEquals("Advantage Player A",score);
	}
	
	@Test
	public void playerBWinOneBallAfterDeuceShouldReturnAdvantagePlayerB() throws Exception {
        	tennisGame.playerScore(40,50);
                String score = tennisGame.getScore();
                assertEquals("Advantage Player B",score);
  	}

}
