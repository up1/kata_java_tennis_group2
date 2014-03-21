package kata.java.tennis;

public class TennisGame {

	int playerAScore;

    public TennisGame(String playerA, String playerB){
    	playerAScore = 0;
    }

    public void playerScore(int playerAScore, int playerBScore) {
    	this.playerAScore =  playerAScore;
    }

    public String getScore(){
    	if (this.playerAScore > 0)
            return "Fifteen Love";
       	return "Love all";
    }
}
