import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversed = reverseNumber(number);

        // Print the reversed number
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed
            num /= 10; // Remove the last digit from the number
        }
        return reversed;
    }
}
