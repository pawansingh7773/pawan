//bianry search ques3; this question is not of an array;
public class main40 {
    static int square(int [] arr, int x){
        int n = arr.length;
        int st=0, end =n;
        int ans =-1;
        while(st<=end){
            int mid = st +(end - st)/2;
            int val = mid*mid;
            if(x == val) return mid;
            if(x<val){
                end = mid-1;
            }else{
                st = mid+1;
                ans = mid;
            }
            
        }
        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(" FINDING CLOSELY SQUARE ROOT VALUE:");
        int [] arr = {1,2,3,4};
        int x = 25;
        System.out.println("YOUR ANS :"+square(arr, x));

    }
    
}
