public class main11{
    public  static class fraction{
        double num;
        double den;
public fraction(double num , double den){
    
}

    }
    static double addition(double num , double den){
        return num+ den;
    }
static double multiply(double num , double den){
    return num*den;
}
    public static void main(String[] args) {
        fraction f1 = new fraction(3.444 , 0.67);
        f1.num= 3.444;
        f1.den = 0.67;
        System.out.println(f1.num);
        System.out.println(f1.den);
        System.out.println("ADDITION OF NUMBERS ARE :"+addition(3.444, 0.67));
        System.out.println("MULTIPLICATION OF VALUE IS:"+multiply(3.444, 0.67));

    }
}
