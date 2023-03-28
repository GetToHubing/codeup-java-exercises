import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        add(15, 777);
        sub(15, 777);
        mul(15, 777);
        div(777, 15);
        mod(777, 15);
        mulV2(11, 15);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
getFactorial(userInput);
        diceRoll();
    }

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void sub(int x, int y) {
        System.out.println(x - y);
    }

    public static void mul(int x, int y) {
        System.out.println(x * y);
    }

    public static void div(int x, int y) {
        System.out.println(x / y);
    }

    public static void mod(int x, int y) {
        System.out.println(x % y);
    }

    public static void mulV2(int x, int y) {
        int result = 0;
        for(int i = x; i > 0; i--) {
            result = result + y;
        }
        System.out.println(result);
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while(x < min || x > max) {
            System.out.println("The number must be between 1 and 10. Pick another number.");
            x = scanner.nextInt();
        }
        return x;
    }

    public static void getFactorial(int factorial) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see the factorial of the number you provided? y/n");
        String yesNo = scanner.next(); //scanner should either be "y" or "n"
        System.out.println(yesNo);
        if(yesNo.equals("y")) { //checks if yesNo equals "y" and if true, for loop should run
            long y = 1;
            String x = null;
            for(int i = 1; i <= factorial; i++) {
                String z = i + "!";
                if(i == 1) {
                    x = " = " + i;
                    String a = i + "!";
                    System.out.println(a.concat(x));
                } else {
                    x = x.concat(" x " + i);
                    System.out.println(z.concat(x));
                    y *= i;
                }
            }
            System.out.println(y);
        } else {
            System.out.print("you messed up");
        }
    }

    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        String again = "";
        do {
        System.out.println("Please enter the amount of sides on the dice you would like to roll.");
        int userNum = scanner.nextInt();
        int roll1 = (int)(Math.random() * userNum);
        int roll2 = (int)(Math.random() * userNum);
        System.out.printf("You rolled a %s and a %s.\nWould you like to roll again? y/n", roll1, roll2);
        again = scanner.next();
        } while(again.equals("y"));
    }


}
