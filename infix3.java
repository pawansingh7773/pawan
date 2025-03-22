import java.util.*;
public class infix3 {
    public static void main(String[] args) {
        String str = "+-95/*346";
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();
        int n = str.length();
        for(int i = n-1 ; i >=0 ; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = ""+ch;
                val.push(s);
            }else if(opr.size()==0) opr.push(ch);
            else{
                if(opr.peek() == '*'){
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = opr.pop(); 
                    String t = v1 + o + v2;
                    val.push(t);
                    
                }
                if(opr.peek() == '/'){
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = opr.pop(); 
                    String t = v1 + o + v2;
                    val.push(t);
                                  
                }
                if(opr.peek() == '+'){
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = opr.pop(); 
                    String t = v1 + o + v2;
                    val.push(t);
                                   
                }
                if(opr.peek() == '-'){
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = opr.pop(); 
                    String t = v1 + o + v2;
                    val.push(t);
                               
                }
                
            }
            opr.push(ch);
        }
        while(val.size()>1){
            String v1 = val.pop();
                    String v2 = val.pop();
                    char o = opr.pop(); 
                    String t = v1 + o + v2;
                    val.push(t);

        }
        System.out.println(val.peek());
    }
    
}
