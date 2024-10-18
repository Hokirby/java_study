package Chapter15.Set;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age; //name 과 age 값이 같으면 동일한 hashCode 리턴
    }
    //equals 재정의

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age); //name 과 age 값이 같으면 true 리턴
        } else {
            return false;
        }
    }
}
