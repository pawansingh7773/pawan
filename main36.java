//BINARY SEARCH ALGORITHM;
import java.util.*;
public class main36 {
    static void printarray(int [] arr){
        for(int val : arr){
            System.out.println(val +" ");
        }
    }
    static boolean binarysearch(int [] arr , int target){
        int n = arr.length;
        boolean flag = false;
        int st =0, end = n-1;
        while(st<=end){
            int mid  = st + (end - st)/2;
            if( arr[mid] == target){
                flag = true;
            }
            if(arr[mid]<target){
                st = mid +1;
            }else{
                end = mid -1;
            }

        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("BINARY SEARCH IMPLEMENTATION:");
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE SIZE OF AN ARRAY:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("ENTER THE ELEMENTS OF AN ARRAY:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printarray(arr);
        System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH:");
        int target = sc.nextInt();
        System.out.println(binarysearch(arr, target));

    }

    
}
