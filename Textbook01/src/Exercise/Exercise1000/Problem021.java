package Exercise.Exercise1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem021 {
    public static int generate() {
        int num = (int) (Math.random() * 45) + 1;
        return num;
    }

    public static void main(String[] args) {
        List<Integer> lottoMade = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("싫어하는 숫자 5개를 입력하세요: ");
        String[] hates = scanner.nextLine().split(" ");
        int[] hateNums = new int[6];
        hateNums[0] = 0;
        int no = 1;
        for (String str : hates) {
            hateNums[no] = Integer.parseInt(str);
            no++;
        }
        while (true) {
            for (int i = 0; i < 6; i++) {
                int tmpNum = generate();
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
