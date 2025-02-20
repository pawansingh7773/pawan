public class main10 {
public static class fraction{
    int num;// numerator
    int den;// denominator
    public fraction(int num , int den){}


    }
    // static int gcd(int num , int den){
    //    if(den == 0) return num;
        // return gcd(den , num%den);
    
    // static void simplify(int num ,  int den ){
        // int hcf = gcd(num, den);
        // num1 = num/hcf;

        // den1 = den/hcf;
        // System.out.println(num1);

    
    public static void main(String[] args) {
        fraction f1 = new fraction(4, 16);
        System.out.println(f1.num+"/"+f1.den);
        // /simplify(num, den);
        System.out.println(f1.num+"/"+f1.den);
    }
}
  

