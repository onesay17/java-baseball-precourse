package baseball.domain;

import baseball.validation.Validator;

public class BaseBallPlayer {

    private String numbers;

    public void setNumbers(String numbers) {
        Validator.validateInputNumbers(numbers);
        this.numbers = numbers;
    }

    public String getNumbers() {
        return numbers;
    }
}
