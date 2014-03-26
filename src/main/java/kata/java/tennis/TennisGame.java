package kata.java.tennis;

import java.util.Map;
import java.util.HashMap;

public class TennisGame {

	int playerAScore = 0;
	int playerBScore = 0;

	Map<Integer, String> scoreMapping = new HashMap() {
		{
		    put(0, "Love");
		    put(15, "Fifteen");
		    put(30, "Thirty");
        put(40, "Forty");
		}
	};

	public TennisGame(String playerA, String playerB) {
	}

	public void playerScore(int playerAScore, int playerBScore) {
		this.playerAScore += playerAScore;
		this.playerBScore += playerBScore;
	}

	public String getScore() {
		if (this.playerAScore == this.playerBScore) {
			return scoreMapping.get(playerAScore) + " all";
		} else {
			return scoreMapping.get(playerAScore) + " " + scoreMapping.get(playerBScore);
		}
	}
}
