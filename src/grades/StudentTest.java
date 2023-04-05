package grades;

public class StudentTest {
    public static void main(String[] args) {
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


        System.out.println(David.getGradeAverage());
        System.out.println(Josh.getGradeAverage());
        System.out.println(Ryan.getGradeAverage());
        System.out.println(carl.getGradeAverage());


    }
}
