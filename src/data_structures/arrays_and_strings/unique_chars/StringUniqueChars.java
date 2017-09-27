package data_structures.arrays_and_strings.unique_chars;

import java.util.*;

public class StringUniqueChars {

    public static boolean hasAllUniqueChars(String str) {

        Set<Character> seenChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seenChars.contains(c)) {
                return false;
            }
            seenChars.add(c);
        }
        return true;
    }

    public static boolean hasAllUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for(int i=0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static boolean hasAllUniqueChars3(String str) {
        str = str.toLowerCase();
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(1 << 3);
        System.out.println(hasAllUniqueChars3("abcd ef"));
        System.out.println(hasAllUniqueChars3("Time complexity"));
    }
}
