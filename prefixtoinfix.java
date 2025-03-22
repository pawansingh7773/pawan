import java.util.*;
public class prefixtoinfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        int n = str.length();
        for(int i = n-1 ; i>=0 ; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii<=57) val.push(""+ch);
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                if(ch == '+') val.push('('+v1+'+'+ v2 +')');
                if(ch == '-') val.push('('+v1+'-'+v2+')');
                if(ch == '*') val.push('('+v1+'*'+v2+')');
                if(ch == '/') val.push('('+v1+'/'+v2+')');
            }

        }


        System.out.println(val.peek());
    }
    
}
