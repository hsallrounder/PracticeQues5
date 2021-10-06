import java.util.Scanner;

public class q5Student {

    String name, address;
    int age;

    public void q5Student() {
        name = "unknown";
        address = "not available";
        age = 0;
    }

    public void setInfo(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        q5Student[] arr = new q5Student[n];
        for(int i=0;i<n;i++){
            String w="n";
            arr[i] = new q5Student();
            arr[i].q5Student();
            System.out.print("Do you want to enter detail (Type- y/n): ");
            w=sc.nextLine();
            if(w.equals("y")){
                String x = "n";
                System.out.print("Do you want to enter address (Type- y/n): ");
                x= sc.nextLine();
                if(x.equals("y")){
                    arr[i].setInfo(sc.nextLine(),sc.nextInt(),sc.next());
                }
                else{
                    arr[i].setInfo(sc.nextLine(),sc.nextInt());
                }
                sc.nextLine();
            }
        }

        System.out.println("Info of " + n + " students:");
        for (int i=0;i<n;i++) {
            System.out.println(i+" Student");
            System.out.println("Name : " +arr[i].name);
            System.out.println("Age : "+ arr[i].age);
            System.out.println("Address : "+ arr[i].address);
        }
    }
}
