package ss8_cleancode_refactor.bai_tap.tenis_game;

public class TennisGame {
    private static String result = "";
    private static int tempScore;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    public static String displayResultWhenScoreEquals(int scorePlayer1) {
        switch (scorePlayer1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }

        return result;
    }

    public static String displayResultWhenEndGame(int scorePlayer1, int scorePlayer2) {
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == ONE) {
            result = "Advantage player 1";
        } else if (minusResult == -ONE) {
            result = "Advantage player 2";
        } else if (minusResult >= TWO) {
            result = "Win for player 1";
        } else {
            result = "Win for player 2";
        }

        return result;
    }

    public static String displayWhenAllFalse(int scorePlayer1, int scorePlayer2) {
        for (int i = 1; i < THREE; i++) {
            if (i == 1) {
                tempScore = scorePlayer1;
            } else {
                result += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    result = "Love";
                    break;
                case 1:
                    result = "Fifteen";
                    break;
                case 2:
                    result = "Thirty";
                    break;
                case 3:
                    result = "Forty";
                    break;
            }
        }

        return result;
    }

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        boolean isEquals = scorePlayer1 == scorePlayer2;
        boolean isWinner = scorePlayer1 >= 4 || scorePlayer2 >= 4;
        //boolean isAllFalse = scorePlayer1 < 4 || scorePlayer2 < 4;

        if (isEquals) {
            result = displayResultWhenScoreEquals(scorePlayer1);
        } else if (isWinner) {
            result = displayResultWhenEndGame(scorePlayer1, scorePlayer2);
        }else {
            result = displayWhenAllFalse(scorePlayer1, scorePlayer2);
        }

        return result;
    }
}