public class main32 {
   static boolean valid(String s){
    boolean ans = true;
    for(int i =0 ; i<s.length();i++){
        for(int j =s.length()-1;j >=0; j--){
            if(s.charAt(i) != s.charAt(j)){
                ans  =  false;
               // System.out.println("not palindrome");
                i++;
                j--;
            }else{
                ans = true;
               // System.out.println("palindrome");
            }
            i++;
            j--;
        }
    }
    return ans;

   }
   public static void main(String[] args) {
       System.out.println(" valid ");
       String s = "dad";
       System.out.println(s);
       System.out.println(valid(s));
    
}
}
