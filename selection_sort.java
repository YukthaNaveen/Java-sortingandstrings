public class selection_sort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        int i,j;
        for (i=0;i<arr.length-1;i++){
            int s=i;
            for(j=i+1;j< arr.length;j++){
                if(arr[s]>arr[j]){
                    s=j;
                }
            }
            int temp=arr[s];
            arr[s]=arr[i];
            arr[i]=temp;
        }
        for(i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
