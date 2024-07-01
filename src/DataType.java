public class DataType {
    public static void main(String[] args) {
        int maxAge = 100;            // 整數 使用32bits儲存
        long  x = 20;                // 整數 使用64bits儲存
        double y = 0.21;             // 浮點數 使用64bits儲存
        float z = 1.5f;              // 浮點數 使用32bits儲存(在數字後面加上 f 或 F 來表示這是一個浮點數)
        char lastName = 'R';         // 字元(僅可使用單引號''框起)
        String firstName = "Wilson"; // 字串(僅可使用雙引號""框起)
        boolean check = true;        // 布林值 true or false

        System.out.println(maxAge);    // 100
        System.out.println(x);         // 20
        System.out.println(y);         // 0.21
        System.out.println(z);         // 1.5
        System.out.println(lastName);  // R
        System.out.println(firstName); // Wilson
        System.out.println(check);     // true
    }
}
