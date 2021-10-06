import java.util.Scanner;

public class arrSearch {
    public boolean search(int arr[], int search_element){
        boolean b = false;
        for (int j : arr) {
            if (j == search_element) {
                b = true;
                break;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arrSearch obj = new arrSearch();
        boolean b1 = obj.search(arr,num);
        if(b1){
            System.out.println(b1);
        }
        else
            System.out.println("element not found");
    }
}
