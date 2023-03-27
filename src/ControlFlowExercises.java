import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
        //1a
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------------------");

        //1b.1
        int y = 0;
        do {
            y += 2;
            System.out.println(y);
        }while(y < 100);
        System.out.println("-------------------------------");

        //1b.2
        int x = 100;
        do {
            System.out.println(x);
            x -= 5;
        }while(x > -10);
        System.out.println("-------------------------------");

        //1b.3
        long z = 2; //why is long needed instead of int
        do {
            System.out.println(z);
            z *= z;
        }while(z < 1000000);
        System.out.println("-------------------------------");

        //1b.4.1
        for (int a = 100; a >= -10; a -= 5) {
            System.out.println(a);
        }
        System.out.println("-------------------------------");

        //1b.4.1.2
        for (long b = 2; b < 1000000; b*=b) {
            System.out.println(b);
        }
        System.out.println("-------------------------------");

        //2
        int c = 1;
        while(c <= 100) {
            if (c % 3 == 0 && c % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(c % 3 == 0) {
                System.out.println("Fizz");
            } else if (c % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(c);
            }
            c++;
        }
        System.out.println("-------------------------------");

        //3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number that you would like squared and cubed: ");
        int v = scanner.nextInt();
        System.out.println("Here is your table");

                System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int d = 1; d <= v; d++) {
//            System.out.println(d + "      |");
            int q = d*d;
            int w = d * d * d;
            if(q > 9) {
                System.out.printf("%s      | %s      | %s%n", d, q, w);

            } else {
                System.out.printf("%s      | %s       | %s%n", d, q, w);
            }
        }
        System.out.println("-------------------------------");

        //4
        System.out.print("Please enter a number grade: ");
        int grade = scanner.nextInt();
        System.out.print("Would you like to see your letter grade? [y/n]");
        String answer = scanner.next();
        if(answer.equals("y")) {
            if(grade > 94) {
                System.out.println("A+");
            } else if (grade > 88) {
                System.out.println("A-");
            } else if (grade > 84) {
                System.out.println("B+");
            } else if (grade > 80) {
                System.out.println("B-");
            } else if (grade > 73) {
                System.out.println("C+");
            } else if (grade > 67) {
                System.out.println("C-");
            } else if (grade > 63) {
                System.out.println("D+");
            } else if (grade > 60) {
                System.out.println("D-");
            } else {
                System.out.println("F");
            }
        }
    }
}



