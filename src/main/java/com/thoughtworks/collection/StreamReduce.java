package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class StreamReduce {

    public StreamReduce() {
    }

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, (first,second) -> second);

        //throw new NotImplementedException();
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce("", (firstWord,secondWord) -> firstWord.length() > secondWord.length() ? firstWord : secondWord);

        // throw new NotImplementedException();
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .reduce((firstWord,secondWord) -> firstWord+secondWord)
                .get().length();
      //  throw new NotImplementedException();
    }

}
