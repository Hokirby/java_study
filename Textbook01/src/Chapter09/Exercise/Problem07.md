### 7. 다음 chatting 클래스는 컴파일 에러가 발생합니다. 원인을 설명해보세요.

```
public class Chatting {
    class Chat {
        void sart() {}
        void sendMessage(STring message) {}
    }
    
    void startChat(String chatId) {
        String nickName = null;
        nickName = chatId;
        
        Chat chat = new Chat() {
        @Override
        public void start() {
            while(true) {
                String inputData = "안녕하세요";
                String message = "[" + nickName + "]" + inputData;
                sendMessage(message);
            }
        }
       };
       
       chat.start;
    }
}
```
---
나의 답:

nickname을 바깥 클래스의 필드로 지정한다.
로컬 변수는 final의 특성을 갖는다.