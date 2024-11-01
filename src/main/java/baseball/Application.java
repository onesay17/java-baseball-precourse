package baseball;

import baseball.Controller.BaseBallGameController;
import baseball.Service.BaseBallGameService;
import baseball.domain.BaseBallGame;

public class Application {
    public static void main(String[] args) {

        BaseBallGame baseBallGame = new BaseBallGame();
        BaseBallGameService baseBallGameService = new BaseBallGameService(baseBallGame);

        BaseBallGameController baseBallGameController = new BaseBallGameController(baseBallGameService);
        baseBallGameController.run();
    }
}
