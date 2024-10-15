package Chapter12.Exercise;

public class Student {
    private String studentNum;

    public Student(String studentNem) {
        this.studentNum = studentNem;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            if (studentNum.equals(student.getStudentNum())) {
                return true;
            }
        }
        return false;
    }

}
