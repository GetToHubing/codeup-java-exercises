package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import util.Input;

public class GradesApplication {
    private static ArrayList<Integer> allGrades = new ArrayList<>();

    public static <string> void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student David = new Student("David");
        Student Josh = new Student("Josh");
        Student Ryan = new Student("Ryan");
        Student carl = new Student("Carl");

        David.addGrade(90);
        David.addGrade(75);
        David.addGrade(62);
        David.addGrade(80);
        Josh.addGrade(95);
        Josh.addGrade(75);
        Josh.addGrade(52);
        Josh.addGrade(80);
        Ryan.addGrade(69);
        Ryan.addGrade(88);
        Ryan.addGrade(92);
        Ryan.addGrade(8);
        carl.addGrade(62);
        carl.addGrade(99);
        carl.addGrade(76);
        carl.addGrade(35);

        students.put("GetToHubing", David);
        students.put("JoshTheLost", Josh);
        students.put("RyanGoshling", Ryan);
        students.put("youTookMyKidneyCarl", carl);

        System.out.println(students.keySet());
        System.out.println("Please choose an option from below:\n1 Pick one student and show their information\n2 Show the information of all the students\n3 Exit program");
        Input userNumber = new Input();
        int number = userNumber.getInt();

        if (number == 1) {
            boolean input = false;
            do {
                System.out.println("Please type in the name of the person you request more information on. Type exit if you wish to exit");
                Input userInput = new Input();
                String userNameRequest = userInput.getString();
                if (students.containsKey(userNameRequest)) {
                    System.out.println("Students name: " + students.get(userNameRequest).getName());
                    System.out.println("Their individual grades: " + students.get(userNameRequest).getGrades());
                    System.out.println("The students average grade: " + students.get(userNameRequest).getGradeAverage());
                    System.out.println("Would you like to choose another student?");
                    Input yesOrNo = new Input();
                    input = yesOrNo.yesNo();
                } else if (userNameRequest.equals("exit")) {
                    input = false;
                } else {
                    System.out.println("That username does not exist.");
                    input = true;
                }
            } while (input);
        } else if (number == 2) {
            for(Map.Entry<String, Student> student : students.entrySet()) {
                System.out.printf("Name: %s | Grades: %s | Grade average: %s\n", student.getValue().getName(), student.getValue().getGrades(), student.getValue().getGradeAverage());
                allGrades.addAll(student.getValue().getGrades());
            }
            double sum = 0;
            for(double grade : allGrades) {
                sum += grade;
            }
            System.out.println("The average grade of the whole class is: " + sum / allGrades.size());
        } else {
            System.out.println("Please stop wasting everyone's time.");
        }
    }
}
