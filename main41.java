import java.util.*;
public class main41 {
    static int method(int n){
        if(n>=0 && n<=9) return n;
        return method(n/10)+n%10;
    }
    public static void main(String[] args) {
        System.out.println("FINDING SUM OF DIGITS");
       Scanner sc =new Scanner(System.in);
       System.out.println("ENTER THE NUMBER:");
       int n = sc.nextInt();
       System.out.println("YOUR REQ ANSWER IS:" +method(n));
    }

    

}
