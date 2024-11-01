package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallPlayerTest {

    @Test
    @DisplayName("올바른 3자리 숫자가 설정되었는지 확인")
    void setNumbers_ValidInputTest() {
        BaseBallPlayer player = new BaseBallPlayer();
        player.setNumbers("123");
        assertEquals("123", player.getNumbers());
    }

    @Test
    @DisplayName("중복된 숫자가 포함된 잘못된 입력이 들어올 때 예외 발생 확인")
    void setNumbers_InvalidInputTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BaseBallPlayer().setNumbers("112");
        });
    }
}