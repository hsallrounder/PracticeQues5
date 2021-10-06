import java.util.Scanner;

class Calculator {
    static int powerInt(int num1, int num2){
        return (int)Math.pow(num1,num2);
    }
    static double powerDouble(double num1, double num2){
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(),num2 = sc.nextInt();
        double num3 = sc.nextDouble();
        int num4 = sc.nextInt();
        System.out.println(powerInt(num1,num2));
        System.out.println(powerDouble(num3,num4));
    }
}