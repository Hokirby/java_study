### 6. 서버측 DatagramSocket 에 대한 설명으로 틀린 것은 무엇입니까?

1. 서버에는 고정된 Port 번호를 제공하고 생성해야 한다.
2. receive() 메소드는 데이터를 수신할 때까지 클로킹된다.
3. 클라이언트의 IP 주소와 Port 번호는 수신된 DatagramPacket 에서 얻을 수 있다.
4. 클리이언트로 DatagramPacket 을 발신할 떄 write() 메소드를 사용한다.

나의 답: 1번

---
내 생각:

서버의 port 는 고정되지 않는다.