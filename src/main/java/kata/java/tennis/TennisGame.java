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
		if (this.playerAScore == this.playerBScore) {
			if (this.playerAScore == 0)
				return "Love all";
			return "Fifteen all";
		} else if (this.playerAScore == 15 && this.playerBScore == 0) {
			return "Fifteen Love";
		} else {
			return "Love Fifteen";
		}
	}
}
