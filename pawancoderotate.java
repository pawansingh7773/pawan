public class pawancoderotate {
    public static void printarray(int [] arr){
        for(int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr , int i , int j){
    
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        
        
    }
    public static void reverse(int [] arr , int i ,int j){
        

    
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;

        }
    }
    public static void rotate(int [] arr , int k){
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printarray(arr);
        
       // int k = 2;
      rotate(arr, 2);
        printarray(arr);
    }
    
}
