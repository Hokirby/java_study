package Chapter15.Exercise;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홀길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        System.out.println("저장된 객체수: " + set.size());
        for (Student s : set) {
            System.out.println(s.studentNum + ":" + s.name);
        }
    }
}