package Practice.Product;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ProductClient {
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    JSONObject jsonMenu;
    int no;

    public void connect() throws IOException {
        socket = new Socket("localhost", 50001);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트]에 서버 연결됨");
    }

    public JSONObject receive() {
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    String data = dis.readUTF();
                    JSONObject menu = new JSONObject(data);
                }
            } catch (Exception e) {
                System.out.println("[클라이언트] 서버 연결 끊김");
            }
        });
        return jsonMenu;
    }

    public void send(String json) throws IOException {
        dos.writeUTF(json);
        dos.flush();
    }

    public void unconnect() throws Exception {
        socket.close();
    }

    public static void main(String[] args) {
        try {
            ProductClient client = new ProductClient();
            client.connect();

            while (true) {
                Product.printMenu(" ");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
                switch (userInput) {
                    case "1": {
                        int no = 1;
                        System.out.println("메뉴: 1. Create | 2. Update |3. Delete | 4. Exit");
                        System.out.println("선택: 1\n");
                        System.out.println("[상품 생성]");
                        System.out.println("상품 이름: ");
                        String name = scanner.nextLine();
                        System.out.println("상품 가격: ");
                        String price = scanner.nextLine();
                        System.out.println("상품 재고: ");
                        String stock = scanner.nextLine();
                        JSONObject menu = new JSONObject();
                        JSONObject num = new JSONObject();
                        num.put("product",name);
                        num.put("price", price);
                        num.put("stock", stock);
                        num.put("num", no);
                        String json = menu.toString();
                        client.send(json);
                        client.receive();
                        no++;
                        break;
                    }
                    case "2": {
                        System.out.println("메뉴: 1. Create | 2. Update |3. Delete | 4. Exit");
                        System.out.println("선택: 2\n");
                        System.out.println("[상품 수정]");
                        System.out.print("상품 번호: ");
                        String merchanNo = scanner.nextLine();
                        System.out.println("상품 이름: ");
                        String userName = scanner.nextLine();
                        System.out.println("상품 가격: ");
                        String userPrice = scanner.nextLine();
                        System.out.println("상품 재고: ");
                        String userStock = scanner.nextLine();
                        JSONObject menu = new JSONObject();
                        JSONObject num = new JSONObject();
                        num.put("product",userName);
                        num.put("price", userPrice);
                        num.put("stock", userStock);
                        menu.put("num", Integer.parseInt(merchanNo));
                        String json = menu.toString();
                        client.send(json);
                        client.receive();
                        break;
                    }
                    case "3": {
                        System.out.println("메뉴: 1. Create | 2. Update |3. Delete | 4. Exit");
                        System.out.println("선택: 3\n");
                        System.out.println("[상품 삭제]");
                        System.out.println("상품 번호: ");
                        String merchanNo = scanner.nextLine();
                        Product.remove(Integer.parseInt(merchanNo));
                        break;
                    }
                    case "4" : {
                        break;
                    } case "\n" : {
                        Product.printMenu("\n");
                    }
                    }
                }
        } catch (IOException e) {
        }
    }
    }
