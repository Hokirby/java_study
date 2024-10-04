### 8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(중첩 for문 이용).
```
int[][] array = {
    {95, 86},
    {83, 92, 96},
    {78, 83, 93, 87, 88}
};
```


```
int[][] array = {
    {95, 86},
    {83, 92, 96},
    {78, 83, 93, 87, 88}
};
int sumArray = 0;
int lengthArray = 0;

for (int[] arrayIn : array) {
    for (int score: arrayIn) {
        sumArray += score;
        //lengthArray += 1
}
    }
    
System.out.println("배열의 전체 합: " + sumArray);
// 위 코드로 간략하게 만들 수 있는 부분
//lengthArray = array[0].length + array[1].length + array[2].length;
int avgArray = sumArray / lengthArray;
System.out.println("배열의 전체 평균: " + avgArray);
```