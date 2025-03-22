import java.util.*;
public class postfix {
    public static void main(String[] args) {
        
    
    String str = "9-(5+3)*4/6";
        System.out.println("infix is :" +str);
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();
        int n = str.length();
        for(int i =0 ; i < n ; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            
            if(ascii>=48 && ascii<=57){
                String s = ""+ch;
                val.push(s);
            }
            else if(opr.size()==0 || ch == '(' || opr.peek() == '(') opr.push(ch);
            else if(ch == ')'){
                while(opr.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = opr.pop();
                    String t = v1+v2+o;
                    val.push(t);
                    

                }
               
               
                opr.pop();
                
                
            } else{ 
            
            if(ch == '-' || ch == '+'){
                String v2 = val.pop();
                String v1 = val.pop();
                char o = opr.pop();
                String t = v1+v2+o;
                val.push(t);
                opr.push(ch);



            } if( ch == '*' || ch == '/'){
                if(opr.peek() == '*' || opr.peek() == '/'){
                String v2 = val.pop();
                String v1 = val.pop();
                char o = opr.pop();
                String t = v1+v2+o;
                val.push(t);
                opr.push(ch);

                }else opr.push(ch);
            }
        }
            
            }

        
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = opr.pop();
            String t = v1+v2+o;
            val.push(t);
        
    }
    System.out.println( " postfix is :" +val.peek());
}
}


    

