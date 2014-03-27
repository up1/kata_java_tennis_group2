package kata.java.tennis;

import java.util.Map;
import java.util.HashMap;

public class TennisGame {

    String playerA;
    String playerB;

    int playerAScore = 0;
    int playerBScore = 0;

    @SuppressWarnings("serial")
	Map<Integer, String> scoreMapping = new HashMap<Integer, String>() {
        {
            put(0, "Love");
            put(15, "Fifteen");
            put(30, "Thirty");
            put(40, "Forty");
            put(50, "Win");
        }
    };

    public TennisGame(String playerA, String playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void playerScore(int playerAScore, int playerBScore) {
        this.playerAScore += playerAScore;
        this.playerBScore += playerBScore;
    }

    public String getScore() {
        String scoreString = scoreMapping.get(playerAScore) + " ";
        
        if (isGameOver()) {
            scoreString = "Win For " + getTheWinner();
        } else if (this.playerAScore == this.playerBScore) {
            if (this.playerAScore == 40) {
                scoreString = "Deuce";
            } else {
                scoreString += "all";
            }
        } else {
            scoreString += scoreMapping.get(playerBScore);
        }
        return scoreString;
    }

    private boolean isGameOver() {
        return playerAScore == 50 || playerBScore == 50;
    }

    private String getTheWinner() {
        return (playerAScore > playerBScore) ? playerA : playerB;
    }
}
