import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Enter number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.print("Enter a word: ");
        scanner.next(); // this is needed...in this spot or nextLine doesn't work correctly...for some reason
        String firstUserWord = scanner.nextLine();
        System.out.println("Your first word was: " + firstUserWord);
        System.out.print("Enter a second word: ");
        String secondUserWord = scanner.nextLine();
        System.out.println("your second word was: " + secondUserWord);
        System.out.print("Enter a third and final word: ");
        String thirdUserWord = scanner.nextLine();
        System.out.println("Your third word was: " + thirdUserWord);
        System.out.print("please enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("your sentence was: " + userSentence);
        //-------------------------------------------------
        System.out.println("please provide the length of your room: ");
        String userRoomLength = scanner.nextLine();
        System.out.println("Please provide the width of your room: ");
        String userRoomWidth = scanner.nextLine();
        int length = Integer.parseInt(userRoomLength);
        int width = Integer.parseInt(userRoomWidth);
        int perimeter = (length * 2) + (width * 2);
        int area = width *length;
        System.out.printf("The area of your room is " + area + " and the perimeter is " + perimeter);
        scanner.next();





    }
}
