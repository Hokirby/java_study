package Chapter09.Exercise;

public class Chatting {
    String nickName;

    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
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

        chat.start();
    }
}