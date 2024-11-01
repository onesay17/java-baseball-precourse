package baseball.Controller;

import baseball.Service.BaseBallGameService;
import baseball.domain.BaseBallPlayer;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallGameController {

    private final BaseBallGameService baseBallGameService;
    private final BaseBallPlayer baseBallPlayer;

    public BaseBallGameController(BaseBallGameService baseBallGameService) {
        this.baseBallGameService = baseBallGameService;
        this.baseBallGameService.initializeGame();
        this.baseBallPlayer = new BaseBallPlayer();
    }

    public void run() {
        boolean isGameRunning = true;
        while (isGameRunning) {
            String playerInputNumbers = InputView.getPlayerInputNumbers();
            baseBallPlayer.setNumbers(playerInputNumbers);
            boolean isRoundComplete = processGameRound();

            if (isRoundComplete) {
                isGameRunning = processGameEnd();
            }
        }
    }

    private boolean processGameRound() {
        OutputView.printResult(baseBallGameService.comparePlayerAndComputer(baseBallPlayer));
        return baseBallGameService.isGameWon();
    }

    private boolean processGameEnd() {
        OutputView.printGameOver();
        String restartChoice = InputView.getRestartChoice();
        boolean restartGame = restartChoice.equals("1");

        if (restartGame) {
            baseBallGameService.initializeGame();
        }
        return restartGame;
    }
}
