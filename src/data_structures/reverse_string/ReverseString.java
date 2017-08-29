package data_structures.reverse_string;

/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
 five characters, including the null character.)
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Animal loots foliated detail of stool lamina"));
        System.out.println(reverse("Acrobats stab orca"));
        System.out.println(reverse(null));
        System.out.println(reverse(""));
    }
    
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        char[] chars =  s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        char temp;

        while(i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);
    }
}
