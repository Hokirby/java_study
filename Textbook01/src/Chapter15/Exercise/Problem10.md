### 10. TreeSet 에 Student 객체를 저장할 때, Student 의 score 필드값을 기준으로 자동 정렬되도록 구현하고 싶습니다. TreeSet 의 last() 메소드를 호출했을 때 가장 높은 score 의 Student 객체가 리턴되도록 Student 클래스에서 밑줄 친 곳 과 비어있는 곳에 코드를 작성해보세요.

```
public class Student (        밑줄         ) {
    public String id;
    public int score;
    
    public Student (String id, int score) {
        this.id = id;
        this.score = score;
    }
    (                   빈칸                    )
}
```
정답:
```
implements Comparable<Student>
@Override
public int compareTo(Student o) {
        if(score < o.score) return -1;
        else if(score = = o.score) return 0;
        else return 1;
        }     
```