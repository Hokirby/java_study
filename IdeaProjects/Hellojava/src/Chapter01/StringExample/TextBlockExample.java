<<<<<<< HEAD:IdeaProjects/Hellojava/src/Chapter01/StringExample/TextBlockExample.java
package Chapter01.StringExample;
=======
package chapter02.StringExample;
>>>>>>> 9bffc922e8e55daf8cc4bb54a1294edf274019af:IdeaProjects/Hellojava/src/chapter02/StringExample/TextBlockExample.java

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\".\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("____________________________");
        System.out.println(str2);
        System.out.println("_____________________________");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);

        //  Editor - Live Template - Java ctrl + alt + s
        //  여기 보시면 자동완성 할 수 있는 키워드들 나열되어있어요
        //  그래서 나중에 보시고 편하게 쓸 수 있는 거 찾아서 쓰시면 될거 같아여

        //  📝 study : Ch01
        //  - 자바 기본 데이터 타입 공부 ✅
        //  - 문자열 포맷팅 공부 ✅
        //  win + ;
    }
}
