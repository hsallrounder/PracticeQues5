public class Specific {
    static int count;
    public Specific(){
        count++;
    }

    public static void main(String[] args) {
        Specific count1 = new Specific();
        Specific count2 = new Specific();
        Specific count3 = new Specific();

        System.out.println(count3.count);
    }
}