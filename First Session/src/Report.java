import java.util.Scanner;

public class Report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        String message;

        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
                message = "When can we meet you to explain the roles and responsibilities of a resident?";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                message = "You have taken a step in the right direction!";
                break;
            case 8:
            case 9:
            case 10:
                message = "Thank you for going the extra mile! Would you be interested in training others?";
                break;
            default:
                message = "Invalid score. Please enter a score between 0 and 10.";
                break;
        }

        System.out.println("Message: " + message);

        scanner.close();
    }
}
