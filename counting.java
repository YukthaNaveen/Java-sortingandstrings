import java.sql.SQLOutput;
import java.util.Locale;

public class counting {
    public static void main(String[] args) {
        int c1 = 0, c2 = 0;
        String word;

        word = "banana";
        word = word.toLowerCase();
        int n = word.length();
        char ch;
        for (int i = 0; i < n; i++) {
            ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c1++;

            }
            else {
                c2++;

            }
        }
        System.out.println("v=" + c1+ " c="+c2);


    }
}



