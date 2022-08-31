package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
//        List<Integer> filteredEvenNumbers = new ArrayList<>();
//        for (Integer number:numbers) {
//            if (number%2==0){
//                filteredEvenNumbers.add(number);
//            }
//        }
//        return filteredEvenNumbers;


    }

    public List<String> filterEndWithS(List<String> words) {
        return words.stream()
                .filter(word -> word.endsWith("s"))
                .collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return numbers.stream()
                .filter(number -> anotherNumbers.contains(number))
                .collect(Collectors.toList());

    }


}
