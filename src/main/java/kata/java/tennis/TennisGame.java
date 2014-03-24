package kata.java.tennis;

public class TennisGame {

	private int playerAScore = 0;
	private int playerBScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public void playerScore(int playerAScore, int playerBScore) {
		this.playerAScore += playerAScore;
		this.playerBScore += playerBScore;
	}

	public String getScore() {
		if (this.playerAScore == 0 && this.playerBScore == 0)
			return "Love all";
		else if (this.playerAScore == 15 && this.playerBScore == 15)
			return "Fifteen all";
		return "Fifteen Love";
	}

}
