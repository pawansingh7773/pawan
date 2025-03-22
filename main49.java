public class main49 {
   static void swap(int [] arr , int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
   }    
   static void reverse(int [] arr , int i , int j){
   // int n = arr.length;
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
       int [] arr = {1,2,3,4,5,6,7};
       int k =3;
       rotate(arr, k);
       for(int val : arr ){
        System.out.println(val);
       }
   }
}
