//binary search ques 4;
public class main42 {
    static int square(int x){
        int st =0 , end = x;
        int ans = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
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
        System.out.println("SQUARE ROOT (FLOOR VALUE )");
        int x = 25;
        System.out.println("YOUR ANS :"+square(x));
    }
    
}
