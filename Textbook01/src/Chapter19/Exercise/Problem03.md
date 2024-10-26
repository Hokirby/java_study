### 3. 다음은 TCP 클라이언트가 서버로 연결 요청을 하고 서버는 연결을 수락하는 코드이다. 빈칸에 들어갈 코드를 작성하세요. (단, 클라이언트와 서버는 같은 컴퓨터에서 실행하고 있습니다.)

[클라이언트]

    Socket socket = (         빈칸         )

[서버]

    ServerSocket serverSocket = new ServerSocket(50001);
    Socket socket = (         빈칸         )

나의 답:

    Socket socket = new Socket();

    ServerSocket serverSocket = new ServerSocket(50001);
    Socket socket = serverSocket.accept();