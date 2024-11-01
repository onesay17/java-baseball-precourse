package baseball.validation;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    @DisplayName("유효한 3자리 숫자가 입력될 때 예외 없이 통과")
    void validateInputNumbers_ValidTest() {
        assertDoesNotThrow(() -> Validator.validateInputNumbers("123"));
    }

    @Test
    @DisplayName("잘못된 길이의 입력이 들어올 때 예외 발생 확인")
    void validateInputNumbers_InvalidLengthTest() {
        assertThrows(IllegalArgumentException.class, () -> Validator.validateInputNumbers("12"));
    }

    @Test
    @DisplayName("중복된 숫자가 포함된 입력이 들어올 때 예외 발생 확인")
    void validateInputNumbers_DuplicateDigitsTest() {
        assertThrows(IllegalArgumentException.class, () -> Validator.validateInputNumbers("112"));
    }
}