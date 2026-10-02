public class Pharmacy {

    String[] medicines;
    double[] prices;

    Pharmacy(String[] m, double[] p) {
        medicines = m;
        prices = p;
    }

    public static void main(String[] args) {

        String[] medicineList = {
            "Paracetamol", "Aspirin", "Ibuprofen"
        };

        double[] priceList = {
            5.50, 8.00, 12.50
        };

        Pharmacy pharmacy = new Pharmacy(
            medicineList, priceList
        );

        for (int i = 0; i < pharmacy.medicines.length; i++) {
            System.out.println(
                pharmacy.medicines[i] + " - ₹" +
                pharmacy.prices[i]
            );
        }
    }
}