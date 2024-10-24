### 7. 소스파일을 읽고 실행 결과와 같이 행의 라인 번호를 추가시켜 출력하도록 밑줄과 빈곳에 코드를 작성해 보세요.

```
import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "C:/Users/admin/Desktop/java_study/Textbook01/src/Chapter18/BufferStream/ReadLineExample.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if(rowData == null) {
                break;
            }
            System.out.println((rowNumber + 1) + ": " + rowData);
            rowNumber++;
        }

        br.close();
        fr.close();
    }
}

```
다른 방법:

```
int rowNumber = 0;
String rowData;
while((rowData = br.readLine())!=null) {
    System.out.println(++rowNumber + ": " + rowData);
}
br.close();
fr.close();
```