import java.util.*;

public class UniqueWordsCounter {
    public static void main(String[] args) {

        String[] wordsArray = {
                "apple", "banana", "orange", "apple",
                "grape", "banana", "kiwi", "orange",
                "banana", "kiwi", "apple", "melon",
                "grape", "kiwi", "kiwi", "orange",
                "pear", "grape", "banana", "apple"
        };


        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordsArray) {

            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }


        Set<String> uniqueWords = wordCountMap.keySet();


        System.out.println("Уникальные слова и количество повторений:");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
