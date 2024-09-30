package Chapter05.ArrayCopyExample;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //길이 3인 배열
        String[] oldStrArray = { "java", "array", "copy"};
        //길이 5인 배열을 생성
        String[] newStrArray = new String[5];
        //배열 항목 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        //System.arraycopy(원본배열, 원본배열복사시작인덱스, 새배열, 새배열붙여넣기시작인덱스, 복사항목수)
        //배열 항목 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
