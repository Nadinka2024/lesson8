import java.util.ArrayList;
import java.util.List;

public class BubbleStudentSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", 4.5));
        students.add(new Student("Петров", 3.7));
        students.add(new Student("Сидоров", 4.2));
        students.add(new Student("Козлов", 5.0));
        students.add(new Student("Смирнов", 3.9));
        bubbleSort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void bubbleSort(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (students.get(j).getAverageGrade() < students.get(j + 1).getAverageGrade()) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
}

class Student {
    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + averageGrade + "]";
    }
}
