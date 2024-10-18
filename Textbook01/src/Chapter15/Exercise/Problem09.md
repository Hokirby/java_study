### 9. HashMap 에 아이디(String) 와 점수(Integer) 가 저장되어 있습니다. 실행 결과와 같이 평균 점수, 최고 점수를 받은 아이디를 출력하도록 코드를 작성해보세요.

```
import java.util.*;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;
        
        //여기에 코드를 작성하세요.
    }
}
```
나의 답:
```
        Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
        name = maxEntry.getKey();
        maxScore = maxEntry.getValue();
        for (int score : map.values()) {
            totalScore += score;
        }

        System.out.println("평균 점수: " + totalScore / map.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
```