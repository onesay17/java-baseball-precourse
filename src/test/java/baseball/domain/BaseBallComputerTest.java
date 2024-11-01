package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallComputerTest {

    @Test
    @DisplayName("컴퓨터가 생성한 숫자가 3자리 숫자이며 중복되지 않고 1~9 사이인지 확인")
    void generatedNumbersValidityTest() {
        BaseBallComputer computer = new BaseBallComputer();
        String numbers = computer.getNumbers();

        assertEquals(3, numbers.length());
        assertTrue(numbers.chars().allMatch(Character::isDigit));
        assertEquals(numbers.chars().distinct().count(), numbers.length());
        assertTrue(numbers.chars().allMatch(c -> c >= '1' && c <= '9'));
    }
}