### 8. HashSet 에 Student 객체를 저장하려고 합니다. 학번이 같으면 동일한 Student 라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다. Student 객체의 해시코드는 학번이라고 가정하고 student 클래스를 작성해보세요.
```
public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    //여기에 코드를 작성하세요.
}
```
```
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

```
나의 답:
```
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            return student.studentNum == studentNum;
        } else {
            return false;
        } 
    }
```
