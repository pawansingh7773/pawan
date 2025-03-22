import java.util.*;
public class main31 {
    static void printarray(int [] arr){
        for(int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }

static void swap(int [] arr, int i , int j ){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static void reverse(int [] arr , int i , int j){
    while (i<j){
        swap(arr, i, j);
        i++;
        j--;
    }
}

    static void rotate(int [] arr , int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);


    }
    public static void main(String[] args) {
        System.out.println("ROTATING AN ARRAY K TIMES:");
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        printarray(arr);
        System.out.println("ENTER THE VALUE OF K");
        int k = sc.nextInt();
        rotate(arr, k);
        printarray(arr);
    }
}
