package Exercise.Exercise1000;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem021 {
    public static int generate() {
        return (int) Math.random() * 45 + 1;
    }

    public static void main(String[] args) {
        List<Integer> lottoMade = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("싫어하는 숫자 5개를 입력하세요: ");
        String[] hates = scanner.nextLine().split(" ");
        int[] hateNums = new int[5];
        int no = 0;
        for (String str : hates) {
            hateNums[no] = Integer.parseInt(str);
            no++;
        }
        while (true) {
            int tmpNum = generate();
            for (int i = 0; i < 5; i++) {
                if (hateNums[i] != tmpNum) {
                    lottoMade.add(tmpNum);
                }
            }
            if(lottoMade.size() == 6) {
                break;
            }
        }
        System.out.print(lottoMade);
    }
}
