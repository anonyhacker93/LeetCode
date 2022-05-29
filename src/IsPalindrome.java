public class IsPalindrome {

    public static void main(String... a) {
        boolean isPalindrome = IsPalindrome.isPalindrome(121);
        System.out.print(isPalindrome);
    }
    static boolean isPalindrome(int x) {
            int revNo = 0;
            int no = x;
            while (no > 0) {
                int rem = no % 10;
                revNo = revNo * 10 + rem;
                no = no / 10;
            }
            return x == revNo;
    }
}
