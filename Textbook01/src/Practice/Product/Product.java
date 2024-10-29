package Practice.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int no;
    private String product;
    private int price;
    private int stock;
    static JSONObject ojt;
    static JSONArray merchanList;


    public static void process(JSONObject jsonObject) {
        Thread thread = new Thread(() -> {
            merchanList.put(jsonObject);
            ojt.put("status", "success");
            ojt.put("data", merchanList);
        });
    }
    public static void remove (int no) {
        merchanList.remove(no);
    }

    public static void printMenu(String userInput) {
        if (userInput.equals("\n")) {
            System.out.println("[상품 목록]");
            System.out.println("------------------------------------------");
            System.out.println("no\tname\t\t\tprice\t\tstock");
            System.out.println("------------------------------------------");
            for (int i = 1; i < ojt.length(); i++) {
                JSONObject no = ojt.getJSONObject(String.valueOf(i));
                System.out.printf("%d\t%s\t\t%d\t%d", i, no.getJSONObject("product"), no.getJSONObject("price"), no.getJSONObject("stock"));
            }
            System.out.println("------------------------------------------");
            System.out.println("메뉴: 1. Create | 2. Update |3. Delete | 4. Exit");
            System.out.print("선택: ");
        } else if (userInput.isBlank()) {
        System.out.println("[상품 목록]");
        System.out.println("------------------------------------------");
        System.out.println("no\tname\t\t\tprice\t\tstock");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("메뉴: 1. Create | 2. Update |3. Delete | 4. Exit");
        System.out.print("선택: ");
        }
    }
}
