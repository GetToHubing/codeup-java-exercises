package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n\n");
        Input userInt = new Input();
        int x = userInt.getInt();
        MoviesArray y = new MoviesArray();
        if(x == 1) {

        }

    }
}
