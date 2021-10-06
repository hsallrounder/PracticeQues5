import java.util.Scanner;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
    For example, while creating object if we pass "Java", then "I love Java" should be printed.
     */

    String s = "I love";

    public Programming(String s) {
        this.s += " "+s;
    }

    public Programming() {
        this.s += " programming languages";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if(!x.equals("")){
            Programming obj = new Programming(x);
            System.out.println(obj.s);
        }
        else{
            Programming obj = new Programming();
            System.out.println(obj.s);
        }
    }
}
