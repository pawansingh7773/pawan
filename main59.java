public class main59 {
    static boolean twod(int [][] arr, int x){
        int n = arr.length;
        int m = arr[0].length;
        int st = 0, end = n*m-1;

        while(st<=end){
            int mid = st +(end-st)/2;
            int midelt = arr[mid/m][mid%m];
            if(x == midelt)return true;
            if( x>midelt){
                st = mid+1;
            }else{
                end = mid-1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7} , {10,11,16,20} ,  {23,30,34,60}};
        int x = 18;
        System.out.println("your ans :" +twod(arr, x));
    }
    
}
