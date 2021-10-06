import java.util.Scanner;

public class AddAmount {
    /*
    Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it.
    Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50.
    Now make two constructors of this class as follows:
    1 - without any parameter - no amount will be added to the Piggie Bank
    2 - having a parameter which is the amount that will be added to Piggie Bank
    Create object of the 'AddAmount' class and display the final amount in Piggie Bank.
     */

    int amount = 50;

    public AddAmount() {
        this.amount +=0 ;
    }

    public AddAmount(int amount) {
        this.amount += amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "n";
        System.out.print("Do you want to add some amount(y/n): ");
        x = sc.nextLine();
        if(x.equals("y")){
            System.out.print("Enter the amount: ");
            int a = sc.nextInt();
            AddAmount obj = new AddAmount(a);
            System.out.println("Final Amount: "+obj.amount);
        }
        else{
            AddAmount obj = new AddAmount();
            System.out.println("Final Amount: "+obj.amount);
        }

    }

}
