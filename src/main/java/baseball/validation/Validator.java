package baseball.validation;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static void validateInputNumbers(String input) {

        if (!input.matches("\\d{3}")) {
            throw new IllegalArgumentException("입력은 3자리 숫자여야 합니다.");
        }

        if (containsDuplicate(input)) {
            throw new IllegalArgumentException("중복되지 않은 3자리 숫자를 입력하세요.");
        }
    }

    private static boolean containsDuplicate(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (!uniqueChars.add(ch)) {
                return true;
            }
        }
        return false;
    }
}
