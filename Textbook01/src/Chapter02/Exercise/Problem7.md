### 7. 변수를 잘못 초기화한 것은 무엇입니까?

1. int var1 = 10;
2. long var2 = 100000000L;
3. char var3 = '';
4. float var4 = 10;
5. String var5 = "abcWndef";
6. String var6 = """
   abc
   def
   """;

나의 답: 3번

---
내생각:

char 타입 변수를 초기화 할때는 다음과 같이 해야한다.
char var3 = ' '; //공백 넣기