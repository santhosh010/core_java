import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numberNames = {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine"
        };

        String input;
        do {
            System.out.print("Enter a number (0-9) or 'q' to quit: ");
            input = scan.nextLine();

            if (!input.equals("q")) {
                try {
                    int number = Integer.parseInt(input);
                    if (number >= 0 && number <= 9) {
                        System.out.println("Number name for " + number + " is: " + numberNames[number]);
                    } else {
                        System.out.println("Invalid input. Please enter a number between 0 and 9.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                }
            }
        } while (!input.equals("q"));

        System.out.println("Exiting the program. Goodbye!");
        scan.close();
    }
}
