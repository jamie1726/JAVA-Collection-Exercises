package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce((firstNumber, secondNumber) -> firstNumber % secondNumber == 0
                        ? firstNumber
                        :secondNumber)
                .get();

    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce((firstWord, secondWord) -> firstWord.length() >= secondWord.length()
                        ? firstWord
                        : secondWord)
                .get();
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .map(word -> word.length())
                .reduce(0, (accumulator, item) -> Integer.sum(accumulator, item));
            //.reduce(0, Integer::sum);
            //.reduce(0, (a, b) -> Integer.sum(a, b));
    }
}
