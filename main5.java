public class main5{
    static void  keypadsubset(String s , String result, String kp[]){
        if(s.length() == 0){
            System.out.println(result + " ");
            return;
        }
        int curr = s.charAt(0)-'0';
        String currchoice = kp[curr];
        for(int i=0;i<currchoice.length();i++){
            keypadsubset(s.substring(1), result+ currchoice.charAt(i), kp);
        }

    }
    public static void main(String[] args) {
        System.out.println("PRINTING THE SUBSETS OF GIVEN KEYPAD:");
        String [] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String s = "23";
        keypadsubset(s, "", kp);
        
    }
}