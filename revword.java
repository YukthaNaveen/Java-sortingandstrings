public class revword {
    public static void main(String[] args) {
        String str = " The sky is blue";
        String ans = " ";
        int j = 0;
        int i = str.length() - 1;
        while (i > 0){
            while (i > 0 && str.charAt(i) == ' ')
                i--;
        j = i;
        while (i > 0 && str.charAt(i) != ' ')
            i--;
        if (ans.isEmpty()) {
            ans = ans.concat(str.substring(i + 1, j + 1));
        } else {
            ans = ans.concat(" " + str.substring(i + 1, j + 1));

        }

        }
        System.out.println(ans);
    }
}