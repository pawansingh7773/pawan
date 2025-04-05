import java.util.*;
public class prefixtopostfix2 {
    public static void main(String[] args) {
        String s ="-9/*+5346";
        Stack<String> str = new Stack<>();
        int n = s.length();
        for(int i = n-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57)str.push(ch+"");
            else if(ch == '+'|| ch == '-' || ch == '*' || ch == '/'){
                String v1 = str.pop();
                String v2 = str.pop();
                String t = v1+v2+ch;
                str.push(t);

            }

        }

        System.out.println(str.peek());
    }
    
}
