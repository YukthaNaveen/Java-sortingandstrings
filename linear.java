import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i;
        int arr[]=new int[size];
        for(i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();

        for(i=0;i<size;i++) {
            if (arr[i] == num) {
                System.out.println("the number you are searching for is in the position " + i);
            }
        }
    }
}
