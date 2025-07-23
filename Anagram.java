import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String s, String t) {

        // char sArray[] = s.toCharArray();
        // char tArray[] = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // return Arrays.equals(sArray, tArray);
        // This is the shoet and inbuilt logic

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp = temp + s.charAt(i);

            }

        }
        s = temp;
        temp = "";

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != ' ') {
                temp = temp + t.charAt(i);

            }

        }

        t = temp;

        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        s = new String(arr);
        t = new String(arr2);

        return s.equalsIgnoreCase(t);

    }

    public static void main(String[] args) {

        String s = "Anagram";
        String t = "Prasad";

        System.out.println(isAnagram(s, t));

    }

}
