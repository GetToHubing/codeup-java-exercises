package util;

import java.util.Scanner;

public class Input {

    //private Field.. of Scanner?
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please type your input here: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no into the console. : ");
        String input = scanner.next();
        if(input.equalsIgnoreCase("y")) {
            return true;
        } else if (input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        System.out.print("Please enter a number: ");
        return (int) scanner.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a number that is between %d and %d. : ", min, max);
        int input = scanner.nextInt();
        while(input < min || input > max) {
            System.out.printf("That number fell out of the min max range. Please enter a number that is between %d and %d. : ", min, max);
            input = scanner.nextInt();
        }
        return input;
    }

    public double getDouble() {
        System.out.print("Please enter a number that is a double.: ");
        return (double) scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number that is between %.2f and %.2f.: ", min, max);
        double input = (double) scanner.nextDouble();
        while(input < min || input > max) {
            System.out.printf("That number fell out of the min max range. Please enter a number that is between %.2f and %.2f.: ", min, max);
            input = (double) scanner.nextDouble();
        }
        return input;
    }

}
