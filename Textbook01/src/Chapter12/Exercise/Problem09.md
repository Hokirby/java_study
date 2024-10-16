### 9. 다음 배열은 UTF-8 문자셋으로 인코딩한 데이터로, 다시 문자열로 디코딩해서 변수 data 에 저장하려고 합니다. 밑줄 친 곳에 들어갈 코드를 작성해 보세요.

```
public class DecodingExample {
    public static void main(String[] args) throws Exception {
        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = (                밑줄              );
        System.out.println("str: " + str);
    }
}
```

나의 답:

new String(bytes)

정답:

new String(bytes, "UTF-8")