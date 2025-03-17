public class Panagram {

    static boolean isPanagram(String s) {
        int count = 0;
        String t = "abcdefghijklmnopqrstuvwxyz";

        s = s.toLowerCase();

        for (int i = 0; i < t.length(); i++) {

            if (s.indexOf(t.charAt(i)) >= 0) {
                count++;

            } else
                break;
        }

        if (count >= 26) {
            return true;
        }

        else
            return false;
    }

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";

        System.out.println(isPanagram(s));

    }

}
