//IMPLEMENTING BINARY SEARCH USING RECURSION;
public class main37 {
    static boolean binarysearch(int [] arr , int st , int end , int target){
        //int n = arr.length;
        int mid =  st + (end -st)/2;
        if(st>end) return false;
        if(arr[mid] == target) return true;
        if(arr[mid] < target){
            binarysearch(arr, mid+1, end, target);
        }else{
            binarysearch(arr, st, mid-1, target);

        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(" USING RECURSION:");
        int [] arr = {1,2,3,4,5};
        int target = 8;
        System.out.println(binarysearch(arr, 0, arr.length-1, target));
    }
    
    
}
