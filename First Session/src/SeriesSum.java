import java.util.Scanner;

public class SeriesSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of p: ");
        double p = scanner.nextDouble();

        if (p < 2.5) {
            System.out.println("Invalid input. Please enter a value greater than or equal to 2.5");
        } else {
            double sum = 0;
            double term = 2.5;
            System.out.println("The Series is as follows:");

            while (term <= p) {
                sum += term;
                System.out.print(term + "  ");
                term += 2;
            }

            System.out.println("\nThe sum of the series up to term " + p + " is: " + sum);
        }

        scanner.close();
    }
}
