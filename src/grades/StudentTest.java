package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("David");
        Student student2 = new Student("Josh");

        student1.addGrade(90);
        student1.addGrade(75);
        student1.addGrade(62);
        student1.addGrade(80);
        student2.addGrade(95);
        student2.addGrade(75);
        student2.addGrade(52);
        student2.addGrade(80);

        System.out.println(student2.getGradeAverage());
        System.out.println(student1.getGradeAverage());
    }
}
