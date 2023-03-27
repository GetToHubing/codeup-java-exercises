import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerv2 = new Scanner(System.in);

        System.out.print("Would you like to talk to Bob? [y/n]");
        String userAnswer = scanner.next();
        if (userAnswer.equals("y")) {
            while (userAnswer.equals("y")) {
                System.out.println("What would you like to say?");
                String userInput = scannerv2.nextLine();
                if (userInput.endsWith("?")) {
                    System.out.println("Bob: sure");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Bob: Whoa, chill out!");
                } else if (userInput.isEmpty()) {
                    System.out.println("Bob: Fine, be that way!");
                } else {
                    System.out.println("Bob: whatever.");
                }
                System.out.println("Would you like to keep talking to Bob? [y/n]");
                userAnswer = scannerv2.nextLine();
            }
        } else {
            System.out.println("Bob: I didn't wanna keep talking anyways");
        }
    }
}
