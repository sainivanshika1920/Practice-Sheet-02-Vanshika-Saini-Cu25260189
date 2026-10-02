public class MedicineBill {
    public static void main(String[] args) {

        String medicineName = "Paracetamol";
        int quantity = 10;
        double price = 5.50;
        double total = quantity * price;

        System.out.println("Medicine: " + medicineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: ₹" + price);
        System.out.println("Total Bill: ₹" + total);
    }
}