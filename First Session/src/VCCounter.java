import java.util.Scanner;

public class VCCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string with only lowercase English alphabets: ");
        String input = scan.nextLine();

        int vowels = 0;
        int consonants = 0;

        // Regular Expression that eliminates chars other than lower case alphabets
        input = input.replaceAll("[^a-z]", "");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);

        scan.close();
    }
}
