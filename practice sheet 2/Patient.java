public class Patient {

    String name;
    int patientId;
    int age;
    String disease;

    Patient(String n, int id, int a, String d) {
        name = n;
        patientId = id;
        age = a;
        disease = d;
    }

    public static void main(String[] args) {
        Patient p = new Patient(
                "Rahul", 101, 25, "Fever"
        );

        System.out.println("Patient Name: " + p.name);
        System.out.println("Patient ID: " + p.patientId);
        System.out.println("Age: " + p.age);
        System.out.println("Disease: " + p.disease);
    }
}