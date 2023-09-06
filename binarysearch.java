public class binarysearch {
    public static int binary(int arr[], int x) {
        int f = 0;
        int l = arr.length - 1;
        while (f <= l) {
            int mid = (f + l) / 2;
            if (x == arr[mid]) {
                System.out.println("found at position = " + mid);
                return mid;
            }

                else if (x > arr[mid]){ f = mid + 1;}
                else {
                l = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,3,5,9,16,23,45};
        int search=binary(a,23);
        System.out.println(search);
    }
}