import java.math.BigInteger;
import java.util.Scanner;

public class Number {
    private int n;

    public void setNum(int num) {
        this.n = num;
    }
    boolean isZero(){
        return (n==0);
    }
    boolean isPositive(){
        return (n>0);
    }
    boolean isNegative(){
        return (n<0);
    }
    boolean isOdd(){
        return (n%2 !=0);
    }
    boolean isEven(){
        return (n%2==0);
    }
    boolean isArmstrong(){
        int str = String.valueOf(n).length();
        int x = n;
        int r=0;
        while(x>0){
            r += (int) (Math.pow(x%10,str));
            x/=10;
        }
        return (r==n);
    }
    static BigInteger n1  = new BigInteger("1");
    public static BigInteger getFactorial(int num){
        while (num>0){
            n1 = n1.multiply(BigInteger.valueOf(num));
            num--;
        }
        return n1;
    }
    int getSqrt(){
        return (int)Math.sqrt(n);
    }
    int getSqr(){
        return (int)Math.pow(n,2);
    }
    int getsumDigits(){
        int a = n;
        int s =0;
        while(a>0){
            s=s+(a%10);
            a/=10;
        }
        return s;
    }
    void dispBinary(){
        System.out.println(Integer.toBinaryString(n));
    }
    void displayhexa(){
        System.out.println(Integer.toHexString(n));
    }
    void dispOctal(){
        System.out.println(Integer.toOctalString(n));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Number obj1 = new Number();
        obj1.setNum(n);
        System.out.println("Factorial = "+obj1.getFactorial(n));
        System.out.println("Square = "+obj1.getSqr());
        System.out.println("Square root = " +obj1.getSqrt());
        System.out.println("Sum of digits = "+obj1.getsumDigits());
        System.out.println("Is armstrong? = "+ obj1.isArmstrong());
        System.out.println("Is even? = "+ obj1.isEven());
        System.out.println("Is odd? = " +obj1.isOdd());
        System.out.println("Is zero? = "+obj1.isZero());
        System.out.println("Is negative? = "+obj1.isNegative());
        System.out.println("Is positive? = " +obj1.isPositive());
        obj1.dispBinary();
        obj1.displayhexa();
        obj1.dispOctal();
    }
}
