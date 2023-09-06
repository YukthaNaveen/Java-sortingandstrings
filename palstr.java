public class palstr {
    public static void main(String[] args) {
        String word = "madam" , pal = "";
        int n = word.length();
        char c;

        for (int i =n-1; i >=0; i--) {
            c = word.charAt(i);
            pal = pal + c;
        }
        if (word.equals(pal)){
            System.out.println("Palindrome");}
         else {
            System.out.println("Not a Palindrome");
        }
    }
}
