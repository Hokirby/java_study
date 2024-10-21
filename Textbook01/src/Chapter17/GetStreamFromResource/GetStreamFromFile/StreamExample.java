package Chapter17.GetStreamFromResource.GetStreamFromFile;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws Exception {
        Path path  = Paths.get(StreamExample.class.getResource("data.txt").toURI()); //data.txt 파일의 경로(Path) 객체 얻기
        Stream<String> stream = Files.lines(path, Charset.defaultCharset()); //파일 열고 한 행씩 읽으면서(기본 UTF-8) String 스트림 생성
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
