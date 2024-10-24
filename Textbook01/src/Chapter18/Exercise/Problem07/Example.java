package Chapter18.Exercise.Problem07;

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
