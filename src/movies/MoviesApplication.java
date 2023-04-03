package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movieList = MoviesArray.findAll();
        System.out.println("Hello! Here you can view a list of movies or add a movie. Would you like to view a list of movies?");
        Input firstQ = new Input();
        boolean yesOrNo = firstQ.yesNo();
        if(yesOrNo) {
            System.out.println("Please type the number of your choice\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category\n");
            Input userInt = new Input();
            int x = userInt.getInt();
            Movie[] testMovie = MoviesArray.findAll();
            if (x == 1) {
                for (Movie testMovies : testMovie) {
                    System.out.printf("%s, %s \n", testMovies.getName(), testMovies.getCategory());
                }
            } else if (x == 2) {
                for (Movie testMovies : testMovie) {
                    if (testMovies.getCategory().equals("animated")) {
                        System.out.printf("%s,\n", testMovies.getName());
                    }
                }
            } else if (x == 3) {
                for (Movie testMovies : testMovie) {
                    if (testMovies.getCategory().equals("drama")) {
                        System.out.printf("%s,\n", testMovies.getName());
                    }
                }
            } else if (x == 4) {
                for (Movie testMovies : testMovie) {
                    if (testMovies.getCategory().equals("horror")) {
                        System.out.printf("%s,\n", testMovies.getName());
                    }
                }
            } else if (x == 5) {
                for (Movie testMovies : testMovie) {
                    if (testMovies.getCategory().equals("scifi")) {
                        System.out.printf("%s,\n", testMovies.getName());
                    }
                }
            }
        }
        System.out.println("Would you like to add a movie?");
        Input secondQ = new Input();
        boolean yesOrNoV2 = secondQ.yesNo();
        if(yesOrNoV2) {
            System.out.println("Please input the name of the movie you would like to add.");
            Input newMovieString = new Input();
            String userMovieName = newMovieString.getString();
            System.out.println("Please input the genre of the movie your adding.");
            Input newMovieStringV2 = new Input();
            String userMovieCategory = newMovieStringV2.getString();
            Movie newMovie = new Movie(userMovieName, userMovieCategory);
            Movie[] newMovieList = addMovie(movieList, newMovie);
            for (Movie testMovies : newMovieList) {
                System.out.printf("%s, %s \n", testMovies.getName(), testMovies.getCategory());
            }
        } else {
            System.out.println("ok bye");
        }
    }

    public static Movie[] addMovie(Movie[] Movies, Movie newMovie){
        Movie[] newMovies = Arrays.copyOf(Movies, Movies.length + 1);
        newMovies[Movies.length] = newMovie;
        return newMovies;
    }
}
