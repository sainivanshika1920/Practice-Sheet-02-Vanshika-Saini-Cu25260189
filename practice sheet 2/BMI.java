public class BMI {

    static void calculateBMI() {
        double weight = 70;
        double height = 1.75;
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);
    }

    public static void main(String[] args) {
        calculateBMI();
    }
}