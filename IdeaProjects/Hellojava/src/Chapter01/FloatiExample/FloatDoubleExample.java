<<<<<<< HEAD:IdeaProjects/Hellojava/src/Chapter01/FloatiExample/FloatDoubleExample.java
package Chapter01.FloatiExample;
=======
package chapter02.FloatiExample;
>>>>>>> 9bffc922e8e55daf8cc4bb54a1294edf274019af:IdeaProjects/Hellojava/src/chapter02/FloatiExample/FloatDoubleExample.java

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 확인
        float var1 = 0.123456789123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1:" + var1);
        System.out.println("var2:" + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3:" + var3);
        System.out.println("var4:" + var4);
        System.out.println("var5:" + var5);
    }
}
