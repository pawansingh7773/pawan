//FIBONACCI USING RECURSION
import java.util.Scanner;
public class main22 {
    static int fib(int n ){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int prev = fib(n-1);
        int prevprev = fib(n-2);
        return prev + prevprev;
    }
    public static void main(String[] args) {
        System.out.println("PRINTING FIBONNACI SERIES:");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N:");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fib(i));
        }


    }
    
}
