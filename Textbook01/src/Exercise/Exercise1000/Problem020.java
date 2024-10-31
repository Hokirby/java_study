package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem020 {

    public static void countLetters(String str) {
        int vowels = 0;
        int consonant = 0;
        int blank = 0;

        String[] strArr = str.split("");
        for (String abc : strArr) {
            if (abc.toLowerCase().equals("a") || abc.toLowerCase().equals("e") || abc.toLowerCase().equals("i") || abc.toLowerCase().equals("o") || abc.toLowerCase().equals("u")) {
                vowels++;
            } else if (abc.isBlank() || abc.isEmpty()) {
                blank++;
            } else {
                consonant++;
            }
        }
        System.out.println("총 모음 개수: " + vowels + "개, 총 자음 개수: " + consonant + "개");
    }

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("입력할 문자열의 개수: 2");
            System.out.print("문자열1 입력: ");
            String str1 = scanner.nextLine();
            System.out.print("문자열2 입력: ");
            String str2 = scanner.nextLine();

            countLetters(str1);
            countLetters(str2);

        }
    }

