public class main4 {
    static void printarray(int []arr , int idx , int currsum){
        int n = arr.length;
        if(idx == n){
            System.out.println(currsum);
            return;
        }
        printarray(arr, idx+1, currsum + arr[idx]);
        printarray(arr, idx+1, currsum);
    }
    public static void main(String[] args) {
        System.out.println("FINDING THE SUBSETS OF ARRAY:");
        int [] arr = {2,4,5};
        printarray(arr, 0, 0);
    }
    
}
