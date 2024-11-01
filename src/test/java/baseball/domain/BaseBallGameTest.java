package baseball.domain;

import static baseball.until.Constant.NOTHING;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallGameTest {
    @Test
    @DisplayName("입력 숫자가 컴퓨터 숫자와 매칭되지 않을 때 '낫싱' 반환 테스트")
    void compareNumbersResult_Nothing() {
        BaseBallGame game = new BaseBallGame();
        String result = game.compareNumbersResult("123", "456");
        assertEquals(NOTHING, result);
    }

    @Test
    @DisplayName("입력 숫자와 컴퓨터 숫자가 스트라이크만 일치할 때 결과 반환 테스트")
    void compareNumbersResult_StrikeOnly() {
        BaseBallGame game = new BaseBallGame();
        String result = game.compareNumbersResult("123", "153");
        assertEquals("0볼 2스트라이크", result);
    }

    @Test
    @DisplayName("입력 숫자와 컴퓨터 숫자가 볼만 일치할 때 결과 반환 테스트")
    void compareNumbersResult_BallOnly() {
        BaseBallGame game = new BaseBallGame();
        String result = game.compareNumbersResult("321", "213");
        assertEquals("3볼 0스트라이크", result);
    }

    @Test
    @DisplayName("입력 숫자와 컴퓨터 숫자가 스트라이크와 볼 모두 포함할 때 결과 반환 테스트")
    void compareNumbersResult_StrikeAndBall() {
        BaseBallGame game = new BaseBallGame();
        String result = game.compareNumbersResult("132", "123");
        assertEquals("2볼 1스트라이크", result);
    }

    @Test
    @DisplayName("3스트라이크일 때 게임이 성공적으로 종료되는지 테스트")
    void isGameWon() {
        BaseBallGame game = new BaseBallGame();
        game.compareNumbersResult("123", "123");
        assertTrue(game.isGameWon());
    }
}