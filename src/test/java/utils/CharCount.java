package utils;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        System.out.println(countChars("Daddy, daddy cool"));
    }

    public static String countChars(String charString){

        char[] stringCharArray = charString.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char eachChar : stringCharArray) {
            if (!String.valueOf(eachChar).isBlank()) {
                if (charMap.containsKey(eachChar)) {
                    charMap.put(eachChar, charMap.get(eachChar) + 1);
                } else {
                    charMap.put(eachChar, 1);
                }
            }
        }
        return charString + " : " + charMap;
    }
}
