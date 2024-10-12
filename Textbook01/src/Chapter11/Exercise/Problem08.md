### 8. FileWriter 는 파일을 열고 데이터를 저장하는 클래스입니다. 예외 발생 여부과 상관 없이 마지막에는 close() 메소드를 실횅해서 파일을 닫아주려고 합니다. 왼쪽 코드는 try-catch-finally 를 이용해서 작성한 코드로, 리소스 자동 닫기를 이용하도록 수정하고 싶습니다. 수정한 코드를 오른쪽에 작성해보세요.

```
import java.io.IOException;

public  class FileWriter implements AutoCloseable {
    public FileWriter(String filePath) throws IOException {
        System.ouyt.println(filePath + "파일을 엽니다.");
    }
    
    public void write(String data) throws IOException {
        System.out.println(data + "를 파일에 저장합니다.");
    }
    
    @Override
    public void close() throws IOException {
        System.out.println("파일을 닫습니다.");
    }
   }
```
```
import hava.io.IOEsception;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
            fw.write("Java"); 
        } catch (IOException e) {
            e.printStackTrace();
        } fianally {
            try { fw.close(); 
            } catch (IOException e) {
            }
        }
    }
}
```
```
import java.io.IOException;

public class FileWriterExample {
    public static void main(STring[] args) {
        (                빈칸                )
    }
}
```

나의 답:
FileWriter fw = new FileWriter("file.txt");
try (fw) {
    fw.write("Java");
} catch (IOException e) {
    e.PrintStackTrace();
}finally {
   fw.close();
}

정답:

try(FileWriter fw = new FileWriter("file.txt")) {
    fw.write("Java");
} catch (IOException e) {
    e.printStackTrace();
]