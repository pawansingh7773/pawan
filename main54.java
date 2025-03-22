public class main54 {
    static boolean binarysearch(int [] arr , int target){
        int n = arr.length;
        int st=0, end = n-1;
        boolean flag = false;
        while(st<end){
            int mid = st+ (end -st)/2;
            if(arr[mid] == target) flag = true;
            if(arr[mid]>target){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return flag;
    }   
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};
        int target = 7;
        System.out.println("your ans " +binarysearch(arr, target));
    }
}
