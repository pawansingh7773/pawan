

public class main2{
static int frogjump(int []h , int idx){
    int n = h.length;
    if(idx == n-1) return 0;
     int op1 = Math.abs(h[idx]- h[idx+1]) +frogjump(h,  idx+1);
     if(idx == n-2) return op1;
     int op2 = Math.abs(h[idx] - h[idx+2])+ frogjump(h,  idx+2);
     return Math.min(op1 , op2 );

}
public static void main(String[] args) {
    System.out.println("FINDING FROG JUMP:");
    int [] h = {10,30,40,20};
    System.out.println("YOUR MINIMUM VALUE IS:"+frogjump(h, 0));
}
}