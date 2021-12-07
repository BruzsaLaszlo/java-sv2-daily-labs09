package day02;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public List<String> shortestWords(List<String> words) {
        int shortestSize = getShortestWordLength(words);
        return findWords(shortestSize, words);
    }

    private int getShortestWordLength(List<String> words) {
        int min = 255;
        for (String word : words) {
            if (min > word.length()) {
                min = word.length();
            }
        }
        return min;
    }

    private List<String> findWords(int size, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length()== size)
                result.add(word);
        }
        return result;
    }

}
