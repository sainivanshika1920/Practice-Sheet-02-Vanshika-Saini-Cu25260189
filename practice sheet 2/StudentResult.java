public class StudentResult {

    static String collegeName = "ABC University";

    String studentName;
    int rollNo;
    int[] marks;

    StudentResult() {
        studentName = "Unknown";
        rollNo = 0;
        marks = new int[]{0, 0, 0};
    }

    StudentResult(String name, int roll, int[] m) {
        studentName = name;
        rollNo = roll;
        marks = m;
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    double calculateAverage() {
        int total = calculateTotal();
        return (double) total / marks.length;
    }

    void displayResult() {

        System.out.println("------------------------");
        System.out.println("College: " + collegeName);
        System.out.println("Student: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                "Subject " + (i + 1) + ": " + marks[i]
            );
        }

        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    public static void main(String[] args) {

        int[] studentMarks = {85, 90, 78};

        StudentResult s1 =
            new StudentResult(
                "Rahul", 101, studentMarks
            );

        s1.displayResult();

        StudentResult s2 = new StudentResult();

        s2.displayResult();
    }
}