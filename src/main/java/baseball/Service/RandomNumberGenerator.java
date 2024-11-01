package baseball.Service;

import static baseball.until.Constant.MAX_RANDOM_VALUE;
import static baseball.until.Constant.MIN_RANDOM_VALUE;
import static baseball.until.Constant.RANDOM_NUMBERS_SIZE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberGenerator {

    public String generateRandomNumbers() {
        Set<Integer> randomNumbers = new HashSet<>();
        StringBuilder result = new StringBuilder();

        while (randomNumbers.size() < RANDOM_NUMBERS_SIZE) {
            Integer randomNumber = generateRandomNumber();
            if (randomNumbers.add(randomNumber)) {
                result.append(randomNumber);
            }
        }

        return result.toString();
    }

    private Integer generateRandomNumber() {
        return Randoms.pickNumberInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
    }

    private void addRandomNumber(List<Integer> randomNumbers) {
        if (!randomNumbers.contains(generateRandomNumber())) {
            randomNumbers.add(generateRandomNumber());
        }
    }
}
