//RETURNIND IDX OF A 2D MATRIX;
public class main60 {
    static int index(int [][] arr , int target){
        int n = arr.length;
        int m = arr[0].length;
        int st =0 , end = n*m-1;
        while(st<=end){
            int mid = st +(end - st)/2;
            int midelt = arr[mid/m][mid%m];
            if(target == midelt) return mid;
            if(target> midelt){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,67}};
        int target = 8;
        System.out.println(" YOUR ANS :" +index(arr, target));
    }
    
}
