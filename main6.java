// import java.util.Scanner;
public class main6 {
    static void subset(String s , String result , String [] arr ){
        if(s.length()==0){
            System.out.println(result +" ");
            return;
        }
        int curr = s.charAt(0) - '0';
        String currc = arr[curr];
        for(int i =0; i<currc.length();i++){
            subset(s.substring(1), result + currc.charAt(i),  arr );
        }
    }
    public static void main(String[] args) {
        System.out.println("PRINTING VALUES OF AN KEYPAD:");
        // Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A VALID NUMBER FROM KEYPAD:");
        // int x = sc.nextInt();
         String s = "79";
        String [] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        subset(s, " ", arr);
    }
    
}
