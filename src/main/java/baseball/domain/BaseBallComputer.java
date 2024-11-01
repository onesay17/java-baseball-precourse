package baseball.domain;

import baseball.Service.RandomNumberGenerator;

public class BaseBallComputer {

    private String numbers;

    public BaseBallComputer() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        this.numbers = randomNumberGenerator.generateRandomNumbers();
    }

    public String getNumbers() {
        return numbers;
    }
}
