package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Would you like to find the area and circumference of a circle?");
        boolean userBoolean;
        do {
            System.out.println("Please provide the radius of the circle to receive the area and circumference.");
            int input = userInput.getInt();
            Circle circle1 = new Circle(input);
            System.out.println("The area is: " + circle1.getArea());
            System.out.println("The circumference is: " + circle1.getCircumference());
            System.out.println("Would you like to go again?");
            userBoolean = userInput.yesNo();
        }while(userBoolean);
    }
}
