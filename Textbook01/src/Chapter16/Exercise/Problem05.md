### 5. 다음 코드의 실행 결과를 보고 밑줄 친 곳에 들어갈 람다식을 작성해보세요.

```
public class Button {
    //정적 멤버 인터페이스(함수형 인터페이스)
    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
```
```
public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> {
            System.out.println(         빈칸1         );
        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> {
            System.out.println(          빈칸2           );
        });
        btnCancel.click();
    }
}

```
나의 답:

빈칸1:

    System.out.println("Ok 버튼을 클릭했습니다.");

빈칸2:

    System.out.println("Cancel 버튼을 클릭했습니다.");

    