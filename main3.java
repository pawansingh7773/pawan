public class main3 {
    static void printString(String s , String currans){
        
        if(s.length()== 0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String rem = s.substring(1);
        printString(rem, currans + curr);
        printString(rem, currans);
    }
    public static void main(String[] args) {
        System.out.println("FINDING SSQ ANSWER:");
        String s = "abc";
        printString(s, " ");
    }    
}
