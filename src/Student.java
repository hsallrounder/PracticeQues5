public class Student {

    String name;
    double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Himanshu",97);
        Student s2 = new Student("Akshit",88);
        Student s3 = new Student("Sangam", 98);

        if(s1.percentage > s2.percentage && s1.percentage > s3.percentage)
            System.out.println(s1.name + " " + s1.percentage);
        else if(s2.percentage > s3.percentage && s2.percentage > s1.percentage)
            System.out.println(s2.name + " " + s2.percentage);
        else
            System.out.println(s3.name + " " + s3.percentage);
    }
}
