//SORTING USING INSERTION SORT;
public class main17 {
    static void inssertionsort(int []arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("SORTING USING INSERTION SORT");
        int [] arr = {2,3,1,6,5};
        inssertionsort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
