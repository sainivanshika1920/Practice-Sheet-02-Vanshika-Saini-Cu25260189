public class HospitalTest {

    static String hospitalName = "City Hospital";
    String patientName;

    void displayResults() {

        int[][] results = {
            {80, 75},
            {90, 85},
            {70, 65}
        };

        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient: " + patientName);
        System.out.println("Test Results:");

        for (int i = 0; i < results.length; i++) {

            System.out.println(
                "Test " + (i + 1) + ": " +
                results[i][0] + ", " + results[i][1]
            );
        }
    }

    public static void main(String[] args) {

        HospitalTest p = new HospitalTest();

        p.patientName = "Rahul";

        p.displayResults();
    }
}