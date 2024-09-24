<<<<<<< HEAD:IdeaProjects/Hellojava/src/Chapter01/VariableExample/VariableExchangeExample.java
package Chapter01.VariableExample;
=======
package chapter02.VariableExample;
>>>>>>> 9bffc922e8e55daf8cc4bb54a1294edf274019af:IdeaProjects/Hellojava/src/chapter02/VariableExample/VariableExchangeExample.java

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
