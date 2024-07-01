import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        // 創建ArrayList friends
        ArrayList<String> friends = new ArrayList<>();

        // 新增資料進ArrayList friends
        friends.add("Mike");
        friends.add("Grace");
        friends.add("Leo");
        friends.add("Brain");

        // 印出ArrayList friends 的大小 (4)
        System.out.println("friends動態陣列的大小: "+friends.size());

        // 印出排序前ArrayList friends 內容
        System.out.println("排序前: "+friends);
        // 依內建排序ArrayList friends 的內容
        Collections.sort(friends);
        // 印出排序後ArrayList friends 內容
        System.out.println("排序後: "+friends);

        // 清空ArrayList
        friends.clear();
        System.out.println(friends.size());  // 印出0
    }
}
