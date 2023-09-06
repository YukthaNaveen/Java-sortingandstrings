public class piglatin {
    public static void main(String[] args) {
        String name = "trouble";
        int n = name.length();
        String s1,s2,f;
        int i;
        char ch;ch=0;
        String last = "ay";
        for (i = 0; i < n-1; i++) {
            ch = name.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'|| ch == 'o'|| ch == 'u')
            break;
        }
                s1=name.substring(0,i);
                s2=name.substring(i,n);
                f=s2+s1+last;
                System.out.println(f);

    }
}