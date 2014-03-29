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
        String scoreString = "";

    	  if (isGameOver()) {
            scoreString = "Win For " + getPlayerHigthScore();
        } else if (isDeuce()) {
            scoreString = "Deuce";
        } else if(isAdvantage()){
      	    scoreString = "Advantage " + getPlayerHigthScore();
        }else {
            scoreString = getTextScore(playerAScore) + " ";
            scoreString += (playerAScore == playerBScore) ? "all" : getTextScore(playerBScore);
        }
        return scoreString;
    }

    private String getTextScore (int playerScore) {
        return scoreMapping.get(playerScore);
    }

    private boolean isGameOver() {
        return (playerAScore == 50 || playerBScore == 50) && Math.abs(playerAScore - playerBScore) >10;
    }

    private boolean isDeuce() {
        return playerAScore == playerBScore && playerAScore == 40;
    }

    private boolean isAdvantage() {
        return playerAScore - playerBScore == 10;
    }
    private String getPlayerHigthScore() {
        return (playerAScore > playerBScore) ? playerA : playerB;
    }
}
