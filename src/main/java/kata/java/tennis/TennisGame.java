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
            put(50, "Win");
        }
    };

    public TennisGame(String playerA, String playerB) {
    }

    public void playerScore(int playerAScore, int playerBScore) {
        this.playerAScore += playerAScore;
        this.playerBScore += playerBScore;
    }

    public String getScore() {
        String scoreString = scoreMapping.get(playerAScore) + " ";
        
        if (this.playerAScore == 50) {
            scoreString += "For Player A";
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
}
