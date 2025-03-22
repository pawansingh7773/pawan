//TOGGLING USING STRING BUILDER METHOD ;


public class main33 {
    static void toggle(StringBuilder s){
       // StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            boolean flag = true;
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ch>=97) flag = false;
            if(flag == true ){
                ascii += 32;
                char dn = (char)ascii;
                s.setCharAt(i, dn);
            }else{
                ascii -= 32;
                char dn = (char)ascii;
                s.setCharAt(i, dn);

            }
        }
    }
    public static void main(String[] args) {
        System.out.println("TOGGLING STRING :");
        StringBuilder s = new StringBuilder("PAWan");
        System.out.println(s);
        toggle(s);
       System.out.println(s);
        //                        System.out.println(s);
    }
    
}
