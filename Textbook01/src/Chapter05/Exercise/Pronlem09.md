### 9. 학생들의 점수를 분석하는 프로그램을 만들려고 합니다. 키보드로부터 학생 수와 학생들의 점수를 입력받고 while 문과 Scanner 의 nextLine()  메소드를 이용해서 최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요.


```
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        int[] scoreArray = new int[0];
        Scanner userInput = new Scanner(System.in);
        int scoreSum = 0;
        int highScore = 0;
        int studentNum = 0;
        int num = 0;

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------");

            if (num == 0) {
                System.out.println("선택> 1");
                System.out.print("학생수> ");
                studentNum = userInput.nextInt();
                num = 1;
            } else if (num == 1) {
                System.out.println("선택> 2");
                scoreArray = new int[studentNum];
                for (int i = 0; i < studentNum; i++) {
                    System.out.printf("scores[%s]> ", i);
                    int score = userInput.nextInt();
                    scoreArray[i] = score;
                }
                num = 2;
            } else if (num == 2) {
                System.out.println("선택> 3");
                for (int i = 0; i < studentNum; i++) {
                    System.out.printf("scores[%s]: %s", i, scoreArray[i]);
                    System.out.println();
                }
                num = 3;
            }else if (num == 3) {
                System.out.println("선택> 4");
                for (int score : scoreArray) {
                    scoreSum += score;
                    if (score > highScore) {
                        highScore = score;
                    }
                }
                float avgScore = (float) scoreSum / studentNum;
                System.out.println("최고 점수: " + highScore);
                System.out.println("평균 점수: " + avgScore);
                num = 4;
            } else {
           System.out.println("선택> 5");
                System.out.println("프로그램 종료");
                break;
            }
        }

    }
}
```