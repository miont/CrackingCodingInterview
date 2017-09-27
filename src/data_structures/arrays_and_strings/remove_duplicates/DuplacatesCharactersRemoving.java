package data_structures.arrays_and_strings.remove_duplicates;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string
 * without using any additional buffer.
 */
public class DuplacatesCharactersRemoving {

    public static String removeDuplicates(String str) {
        if(str == null) return null;
        if(str.isEmpty()) return "";

        int n = str.length();
        char[] chars = str.toCharArray();

        int i = 1;
        int j = 1;

        while(j < n) {
            if(chars[j] != chars[j-1]) {
                chars[i++] = chars[j];
            }
            j++;
        }

        return new String(chars, 0, i);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(null));
        System.out.println(removeDuplicates(""));
        System.out.println(removeDuplicates("a"));
        System.out.println(removeDuplicates("abcd"));
        System.out.println(removeDuplicates("aaaabbbcdddd"));
        System.out.println(removeDuplicates("abbbcdddd"));
    }

}
