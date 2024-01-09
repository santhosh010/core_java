import java.util.Scanner;

public class WaterCharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of units of water consumed by the household: ");
        int unitsConsumed = scan.nextInt();

        double totalCharge = 0;

        if (unitsConsumed > 0) {
            if (unitsConsumed <= 100) {
                totalCharge = unitsConsumed * 2.00;
            } else if (unitsConsumed <= 300) {
                totalCharge = 100 * 2.00 + (unitsConsumed - 100) * 3.00;
            } else {
                totalCharge = 100 * 2.00 + 200 * 3.00 + (unitsConsumed - 300) * 5.00;
                // Apply sur-charge of 2.5% if units consumed is above 300
                double surcharge = totalCharge * 0.025;
                totalCharge += surcharge;
            }

            System.out.println("Total charge to be paid: Rs " + totalCharge);
        } else {
            System.out.println("Invalid input. Please enter a valid number of units consumed.");
        }

        scan.close();
    }
}
