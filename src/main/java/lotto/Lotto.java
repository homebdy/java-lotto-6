package lotto;

import lotto.constant.OutputMessage;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    private static final String START_MESSAGE = "[";
    private static final String END_MESSAGE = "]";

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = new ArrayList<>(numbers);
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isContain(int number) {
        return numbers.contains(number);
    }

    public int getNumberByIndex(int index) {
        return numbers.get(index);
    }

    public String getNumbers() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(START_MESSAGE);
        List<String> elements = numbers.stream()
                .map(Object::toString)
                .toList();
        stringBuilder.append(String.join(OutputMessage.NUMBER_DELIMITER.getMessage(), elements));
        stringBuilder.append(END_MESSAGE);
        return stringBuilder.toString();
    }
}
