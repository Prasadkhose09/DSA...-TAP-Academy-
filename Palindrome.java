public class Palindrome {

    public static boolean isPalindrome(String s) {

        int ss = 0;
        int e = s.length() - 1;

        boolean flag = false;

        while (ss <= e) {

            if (s.charAt(ss) != s.charAt(e)) {
                flag = false;
                break;

            }

            else {
                flag = true;
            }

            ss++;
            e--;

        }

        return flag;

    }

    public static void main(String[] args) {

        String s = "NIITIIN";
        System.out.println(isPalindrome(s));

    }

}
