public class CountVowels {

    public static int VowelCount(String s) {
        int count = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'a' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "TAP ACADEMY is best";
        System.out.print(VowelCount(s));

    }

}
