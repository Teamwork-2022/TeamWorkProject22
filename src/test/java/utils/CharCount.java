package utils;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        //System.out.println(countChars("aaa"));
        //System.out.println(charCount("bbaaaaaaanbh"));
        System.out.println(removeVowels("dkfjdadkjfdeknvmidnnfodfdsnncuu"));


    }

    //given a string of characters, return the number of times each character occurs in that string.

    public static Map<Character, Integer> charCount(String strChar) {
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charsOfStr = strChar.toCharArray();
        if (!String.valueOf(charsOfStr).isBlank()) {

            for (int i = 0; i < charsOfStr.length; i++) {

                for (char c : charsOfStr) {
                    charMap.put(c, i);
                    //if (charMap.containsKey(c)){
                    if (charMap.get(c) == 1) {
                        System.out.print(c + " ");
                    } else charMap.put(c, charMap.size() + 1);
                }
                //  else charMap.put(c, 1);
                //   }
            }
        }
        return charMap;
    }

    public static String removeVowels(String str){
        char[] str2 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
                return str.charAt(i)+"";

            }
        }

        //return str2;
//        return str.replaceAll("[aeiou]", "*");


        return str;
    }


    public static String countChars(String charString){

        int count = 0;
        char[] stringCharArray = charString.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char eachChar : stringCharArray) {
            if (String.valueOf(eachChar).isBlank()) {
                count++;
            }
        }
        return "Blank space is " + count;
    }
}
