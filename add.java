import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int n = s.nextInt(); // Read user input

        if (n % 2 == 0) {
            System.out.println("The given number " + n + " is Even ");
        } else {
            System.out.println("The given number " + n + " is Odd ");
        }
        s.close(); // Close the scanner
    }
}
