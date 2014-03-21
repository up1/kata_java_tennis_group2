package kata.java.tennis;

public class TennisGame {

	Integer playerAScore;

    public TennisGame(String playerA, String playerB){
    	playerAScore = 0;
    }

    public void playerScore(Integer playerAScore, Integer playerBScore) {
    	this.playerAScore =  playerAScore;
    }

    public String getScore(){
    	if (this.playerAScore == 0)
        	return "Love all";
        return "Fifteen Love";
    }
}
