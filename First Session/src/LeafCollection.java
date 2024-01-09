import java.util.Scanner;

public class LeafCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSamples = 0; // stores total leaves collected
        int rounds = 0; // tracks the no. of rounds
        int samplesCollected; // stores leaves collected in current round

        do {
        	// gain user input for collection of samples of the current
            System.out.print("Enter the number of leaf samples collected in round " + (rounds + 1) + ": ");
            samplesCollected = scan.nextInt();

            if (samplesCollected < 1) {
            	/* There is at least one
            	 * sample collected per round.
            	 * Hence throw an explanatory message.
            	 * Skip back to the beginning.
            	 */
                System.out.println("Invalid input. Please enter values above 1.");
                continue;
            }

            totalSamples += samplesCollected; // adding up samples collected till current round.
            rounds++; // keeping track of rounds.

        } while (totalSamples < 30); //runs until minimum of 30 samples are collected.

        System.out.println("Asif collected a total of " + totalSamples + " leaf samples.");
        System.out.println("He took " + rounds + " rounds around the park to collect these samples.");

        scan.close();
    }
}
