package baseball.domain;

import static baseball.until.Constant.BALL;
import static baseball.until.Constant.NOTHING;
import static baseball.until.Constant.STRIKE;
import static baseball.until.Constant.WINNING_STRIKE_COUNT;

public class BaseBallGame {

    private Integer strikeCount;
    private Integer ballCount;
    private boolean isNothing;

    public BaseBallGame() {
        resetGame();
    }

    public String compareNumbersResult(String playerNumbers, String computerNumbers) {
        resetGame();

        for (int i = 0; i < playerNumbers.length(); i++) {
            if (playerNumbers.charAt(i) == computerNumbers.charAt(i)) {
                strikeCount++;
            } else if (computerNumbers.contains(String.valueOf(playerNumbers.charAt(i)))) {
                ballCount++;
            }
        }

        if (strikeCount == 0 && ballCount == 0) {
            isNothing = true;
            return NOTHING;
        } else if (strikeCount.equals(WINNING_STRIKE_COUNT)) {
            return WINNING_STRIKE_COUNT + STRIKE;
        } else {
            return ballCount + BALL + " " + strikeCount + STRIKE;
        }
    }

    public boolean isGameWon() {
        return strikeCount.equals(WINNING_STRIKE_COUNT);
    }

    private void resetGame() {
        this.strikeCount = 0;
        this.ballCount = 0;
        this.isNothing = false;
    }
}
