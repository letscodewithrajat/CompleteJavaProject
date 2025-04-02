package com.rajat.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rajatsrivastava
 **/
public class MapRunner {
    public static void main(String[] args) {
        /*
        Map<String, Integer> map = Map.of("A", 3, "Y", 7, "B", 5, "Z", 10);
        Map<String, Integer> hashMap = new HashMap<>(map);
        System.out.println(hashMap);
        hashMap.put("R", 1);
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(map);
        System.out.println(linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);*/

        String str = "This is an awesome occasion . " +
                "This has never happened before .";

        Map<String, Integer> stringOccurences = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = stringOccurences.get(word);
            if (integer == null) {
                stringOccurences.put(word, 1);
            } else {
                stringOccurences.put(word, integer + 1);
            }
        }
        System.out.println(stringOccurences);

        Map<Character, Integer> occurences = new HashMap<>();
        char[] characters = str.toCharArray();
        for (char character : characters) {
            Integer integer = occurences.get(character);
            if (integer == null) {
                occurences.put(character, 1);
            } else {
                occurences.put(character, integer + 1);
            }
        }

        System.out.println(occurences);

    }
}
