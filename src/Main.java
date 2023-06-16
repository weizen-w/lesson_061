import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Student1", 60));
    students.add(new Student("Student2", 87));
    students.add(new Student("Student3", 98));
    students.add(new Student("Student4", 75));
    students.add(new Student("Student5", 81));
    students.add(new Student("Student6", 67));
    students.add(new Student("Student7", 54));
    students.add(new Student("Student8", 86));
    students.add(new Student("Student9", 91));
    students.add(new Student("Student10", 100));
    students.add(new Student("Student11", 73));
    students.add(new Student("Student12", 91));
    students.add(new Student("Student13", 58));
    students.add(new Student("Student14", 47));
    students.add(new Student("Student15", 57));
    students.add(new Student("Student16", 51));
    students.add(new Student("Student17", 62));
    System.out.print("Введите минимальный проходной балл: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    students.stream()
        .filter(s -> s.getScore() >= a)
        .sorted(((o1, o2) -> -(o1.getScore() - o2.getScore())))
        .limit(10)
        .forEach(System.out::println);
  }
}
