import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 7;
        int ranNum = (int) (Math.random() * 100);
        int a = 0;
        System.out.println("Guess what number i'm thinking of between 1 and 100.");
        int userNum = scanner.nextInt();
        do {
            if (userNum == ranNum) {
                System.out.println("GOOD GUESS!");
                a = 1;
            } else if (userNum < ranNum) {
                System.out.println("HIGHER\nGuess again");
                userNum = scanner.nextInt();
            } else if (userNum > ranNum) {
                System.out.println("LOWER\nGuess again");
                userNum = scanner.nextInt();
            }
            if (count == 0) {
                System.out.println("You're not very good at this huh? How about you come try again later");
            }
            count--;
        } while (a != 1 && count >= 0);
    }
}
