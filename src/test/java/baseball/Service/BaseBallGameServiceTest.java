package baseball.Service;

import static org.junit.jupiter.api.Assertions.assertFalse;

import baseball.domain.BaseBallGame;
import baseball.domain.BaseBallPlayer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallGameServiceTest {

    @Test
    @DisplayName("컴퓨터 숫자와 플레이어 입력을 비교해 예상 결과가 출력되는지 테스트")
    void comparePlayerAndComputerTest() {
        BaseBallGameService gameService = new BaseBallGameService(new BaseBallGame());
        BaseBallPlayer player = new BaseBallPlayer();
        player.setNumbers("123");

        gameService.initializeGame();
        String result = gameService.comparePlayerAndComputer(player);
        System.out.println("비교 결과: " + result);
    }

    @Test
    @DisplayName("게임이 아직 종료되지 않았을 때 승리 여부 확인 테스트")
    void isGameWonFalseTest() {
        BaseBallGameService gameService = new BaseBallGameService(new BaseBallGame());
        gameService.initializeGame();
        boolean isWon = gameService.isGameWon();
        assertFalse(isWon);
    }
}