package Practice.Product;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductServer {
     static JSONArray merchanList;
     static ServerSocket serverSocket;
     static ExecutorService executorService = Executors.newFixedThreadPool(100);

    public static void main(String[] args) {
        try {
            ProductServer.start();
            Scanner scanner = new Scanner(System.in);
            System.out.println("--------------------------------------------");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입혁하세요.");
            System.out.println("---------------------------------------------");
            while (true) {
                String key = scanner.nextLine();
                if (key.toLowerCase().equals("q")) {
                    break;
                }
                scanner.close();
                ProductServer.stop();
            }
        } catch (Exception e) {
        }
        stop();
    }

    public static void start() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");
                    System.out.println("\n[서버]  연결 요청을 기다림\n");
                    while (true) {
                        Socket socket = serverSocket.accept();
                        executorService.execute(() -> {
                            try {
                                DataInputStream dis = new DataInputStream(socket.getInputStream());
                                String json = dis.readUTF();
                                JSONObject jsonObject = new JSONObject(json);
                                Product.process(jsonObject);
                                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                                dos.writeUTF(json);
                                dos.flush();
                                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                                System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");
                                socket.close();
                                System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
                            } catch (IOException e) {
                            }
                        });
                    }
                    } catch(IOException e){
                        System.out.println("status: " + Product.ojt.get("status"));
                        for (int i = 0; i < merchanList.length(); i++) {
                            System.out.println("data: " + merchanList.toString());
                        }
                    }
                };
        };
        thread.start();
    }

    public static void stop() {
        try{
            serverSocket.close();
            executorService.shutdownNow();
            System.out.println("[서버] 종료됨");
        } catch (IOException e1) {
        }
    }


}
