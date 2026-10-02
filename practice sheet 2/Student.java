public class Student {
    String name;
    int rollNo;
    double marks;

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNo = 101;
        s1.marks = 85.5;

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);
    }
}