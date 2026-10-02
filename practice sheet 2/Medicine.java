public class Medicine {

    String medicineName;
    double price;

    Medicine() {
        medicineName = "Paracetamol";
        price = 5.50;
    }

    public static void main(String[] args) {
        Medicine m = new Medicine();

        System.out.println("Medicine: " + m.medicineName);
        System.out.println("Price: ₹" + m.price);
    }
}