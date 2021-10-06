import java.util.Scanner;

public class Car {
    String manufacturer;
    int price;

    public Car(int price, String manufacturer) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car(sc.nextInt(), sc.nextLine());
        Car car2 = new Car(sc.nextInt(), sc.nextLine());
        Car car3 = new Car(sc.nextInt(), sc.nextLine());

        if(car1.price>car2.price && car1.price>car3.price){
            if(car2.price > car3.price){
                System.out.println(car1.manufacturer+" "+car1.price);
                System.out.println(car2.manufacturer+" "+car2.price);
                System.out.println(car3.manufacturer+" "+car3.price);
            }
            else{
                System.out.println(car1.manufacturer+" "+car1.price);
                System.out.println(car3.manufacturer+" "+car3.price);
                System.out.println(car2.manufacturer+" "+car2.price);
            }
        }
        else if(car2.price>car1.price && car2.price>car3.price){
            if(car1.price > car3.price){
                System.out.println(car2.manufacturer+" "+car2.price);
                System.out.println(car1.manufacturer+" "+car1.price);
                System.out.println(car3.manufacturer+" "+car3.price);
            }
            else{
                System.out.println(car2.manufacturer+" "+car2.price);
                System.out.println(car3.manufacturer+" "+car3.price);
                System.out.println(car1.manufacturer+" "+car1.price);
            }
        }
        else{
            if(car1.price > car2.price){
                System.out.println(car3.manufacturer+" "+car3.price);
                System.out.println(car1.manufacturer+" "+car1.price);
                System.out.println(car2.manufacturer+" "+car2.price);
            }
            else{
                System.out.println(car3.manufacturer+" "+car3.price);
                System.out.println(car2.manufacturer+" "+car2.price);
                System.out.println(car1.manufacturer+" "+car1.price);
            }
        }
    }
}