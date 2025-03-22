//BINARY SEARCH QUES 1;
public class main38 {
    static int binaryindex(int [] arr , int x ){
        int n = arr.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st<=end){
       int mid = st +(end -st)/2;
       if(arr[mid] == x){
            ans = mid;
            end = mid-1;
       } else if(arr[mid]<x){
        st = mid+1;

       }else{
        end = mid-1;
       }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("FINDING FIRST OCCURENCE OF A GIVEN TARGET:");
        int [] arr = {1,2,2,2,3,4,4,5,5};
        int x = 9;
        System.out.println("YOUR ANS IS: "+binaryindex(arr, x));
    }

    
}
