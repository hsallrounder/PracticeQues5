import java.util.Scanner;

public class Room {

    boolean AC_ON = false,HOME_THEATRE_ON = false,FAN_ON = false,LIGHT_ON = false;

    Room(String AC, String HOME_THEATRE, String FAN, String LIGHT) {
        if(AC.equals("ON")){
            this.AC_ON = true;
        }
        else{
            this.AC_ON = false;
        }
        if(HOME_THEATRE.equals("ON")){
            this.HOME_THEATRE_ON = true;
        }
        else{
            this.HOME_THEATRE_ON = false;
        }
        if(FAN.equals("ON")){
            this.FAN_ON = true;
        }
        else{
            this.FAN_ON = false;
        }
        if(LIGHT.equals("ON")){
            this.LIGHT_ON = true;
        }
        else{
            this.LIGHT_ON = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!! Welcome to your room BOSS :) !!\n");
        System.out.print("Enter your choice(ON/OFF) for the AC: ");
        String ac = sc.nextLine();
        System.out.print("Enter your choice(ON/OFF) for the Home Theatre: ");
        String ht = sc.nextLine();
        System.out.print("Enter your choice(ON/OFF) for the Fan: ");
        String fan = sc.nextLine();
        System.out.print("Enter your choice(ON/OFF) for the Light: ");
        String light = sc.nextLine();
        Room appl = new Room(ac,ht,fan,light);
        System.out.println();
        System.out.println("You Chose:");
        System.out.println("AC: " + ac);
        System.out.println("Home Theatre: " + ht);
        System.out.println("Fan: " + fan);
        System.out.println("Light: " + light);

        int power=0;
        if(appl.AC_ON){
            power+=1200;
        }
        if(appl.HOME_THEATRE_ON){
            power+=600;
        }
        if(appl.FAN_ON){
            power+=400;
        }
        if(appl.LIGHT_ON){
            power+=100;
        }
        System.out.println();
        if(power>2000){
            System.out.println("Overload");
        }
    }
}
