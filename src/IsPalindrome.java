import java.util.HashMap;

public class IsPalindrome {
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
