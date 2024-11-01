package baseball.Service;

import baseball.domain.BaseBallComputer;
import baseball.domain.BaseBallGame;
import baseball.domain.BaseBallPlayer;

public class BaseBallGameService {

    private BaseBallComputer baseBallComputer;
    private final BaseBallGame baseBallGame;

    public BaseBallGameService(BaseBallGame baseBallGame) {
        this.baseBallGame = baseBallGame;
    }

    public void initializeGame() {
        baseBallComputer = new BaseBallComputer();
        System.out.println(baseBallComputer.getNumbers());
    }

    public String comparePlayerAndComputer(BaseBallPlayer baseBallPlayer) {
        return baseBallGame.compareNumbersResult(baseBallPlayer.getNumbers(), baseBallComputer.getNumbers());
    }

    public boolean isGameWon() {
        return baseBallGame.isGameWon();
    }
}
