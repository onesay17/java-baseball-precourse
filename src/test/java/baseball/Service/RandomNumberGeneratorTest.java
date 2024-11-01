package baseball.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

    @Test
    @DisplayName("3자리의 중복 없는 1~9 범위의 랜덤 숫자가 생성되는지 확인")
    void generateRandomNumbersTest() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        String randomNumbers = generator.generateRandomNumbers();

        assertEquals(3, randomNumbers.length());
        assertEquals(randomNumbers.chars().distinct().count(), randomNumbers.length());
        assertTrue(randomNumbers.chars().allMatch(c -> c >= '1' && c <= '9'));
    }
}