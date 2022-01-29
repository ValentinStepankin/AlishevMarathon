package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Рон");
        Teacher teacher = new Teacher("Северус Снегг", "зельеваренье");
        teacher.evaluate(student);
    }
}
