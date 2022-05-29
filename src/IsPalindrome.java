public class IsPalindrome {

    public static void main(String... a) {
        boolean isPalindrome = IsPalindrome.isPalindrome(0);
        System.out.print(isPalindrome);
    }
    static boolean isPalindrome(int x) {
        if (x >= 0) {
            int revNo = 0;
            int no = x;
            while (no > 0) {
                no = no % 10;
                revNo = revNo * 10 + no;
                no = no / 10;
            }
            return no == revNo;
        }
        return false;
    }
}
