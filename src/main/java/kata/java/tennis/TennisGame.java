package kata.java.tennis;

public class TennisGame {

	int playerAScore = 0;
	int playerBScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public void playerScore(int playerAScore, int playerBScore) {
		this.playerAScore += playerAScore;
		this.playerBScore += playerBScore;
	}

	public String getScore() {
		if (this.playerAScore > 0 && this.playerBScore > 0)
			return "Fifteen all";
		if (this.playerAScore > 0)
			return "Fifteen Love";
		return "Love all";
	}
}
