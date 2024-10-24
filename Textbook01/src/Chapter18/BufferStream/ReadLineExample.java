package Chapter18.BufferStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/Chapter18/BufferStream/ReadLineExample.java")
        );

        int lineNo = 1;
        while (true) {
            String str = br.readLine(); //1행을 읽음
            if(str == null) break; //더 이상 읽을 내용이 없으면 while 문 종료
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }

        br.close();
    }
}
