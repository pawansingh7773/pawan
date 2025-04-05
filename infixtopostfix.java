import java.util.*;
public class infixtopostfix {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        Stack<String> str = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for(int i =0 ; i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57 )str.push(ch +"");
            else if(opr.size()==0 || ch == '(' || opr.peek()=='(')opr.push(ch);
          else  if(ch == ')'){
                while(opr.peek()!='('){
                String v2 = str.pop();
                String v1 = str.pop();
                char o = opr.pop();
                String t = v1+v2+o;
                str.push(t);}
                opr.pop();

            }else{

            
            if(ch == '+' || ch == '-'){
                String v2 = str.pop();
                String v1 = str.pop();
                char o = opr.pop();
                String t = v1+v2+o;
                str.push(t);
                opr.push(ch);


            }
           else if(ch == '*' || ch == '/'){
            if(opr.peek()=='*' || opr.peek() == '/'){
                String v2 = str.pop();
                String v1 = str.pop();
                char o = opr.pop();
                String t = v1+v2+o;
                str.push(t);
                opr.push(ch);
            }else opr.push(ch);

            }
        }
        }
        while(str.size()>1){
            String v2 = str.pop();
                String v1 = str.pop();
                char o = opr.pop();
                String t = v1+v2+o;
                str.push(t);
                

        }
        System.out.println(str.peek());

    }
    
}
