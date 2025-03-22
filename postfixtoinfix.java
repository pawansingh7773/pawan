import java.util.*;
public class postfixtoinfix {
 public static void main(String[] args) {
     String str = "953+4*6/-";
     Stack<String> val = new Stack<>();
     for(int i = 0 ; i < str.length() ;  i++){
        char ch = str.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48 && ascii<=57){
            val.push(""+ch);
        }else{
            String v2 = val.pop();
            String v1 = val.pop();
            if(ch == '+') val.push('('+v1+'+'+v2+')');
            if(ch == '-') val.push('('+v1+'-'+v2+')');
            if(ch == '*') val.push('('+v1+'*'+v2+')');
            if(ch == '/') val.push('('+v1+'/'+v2+')');
        }

     }
     System.out.println(val.peek());

 }   
}
