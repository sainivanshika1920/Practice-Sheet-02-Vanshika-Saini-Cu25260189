public class StudentMarks {

    static void calculateAverage() {
        int[] marks = {80, 75, 90, 85, 70};
        int total = 0;

        for (int mark : marks) {
            total = total + mark;
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        calculateAverage();
    }
}