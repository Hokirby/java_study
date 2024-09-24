<<<<<<< HEAD:IdeaProjects/Hellojava/src/Chapter01/CharacterExample/CharExample.java
package Chapter01.CharacterExample;
=======
package chapter02.CharacterExample;
>>>>>>> 9bffc922e8e55daf8cc4bb54a1294edf274019af:IdeaProjects/Hellojava/src/chapter02/CharacterExample/CharExample.java

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; //문자 저장
        char c2 = 65; //유니코드 직접 저장

        char c3 = '가'; //문자 저장
        char c4 = 44032; //유니코드 직접 저장

        // char c = ''; // 컴파일 에러
        char c = ' '; //공백 하나를 포함해서 초기화

        // char var1 = "A"; //컴파일 에러: 작은따옴표('')민 유니코드로 변환
        // char var2 = "홍길동"; //컴파일 에러

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c);
    }
}
