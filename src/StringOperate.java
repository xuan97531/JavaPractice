
public class StringOperate {
    public static void main(String[] args) {
        String name = "Wilson";
        // W i l s o n
        // 0 1 2 3 4 5

        System.out.println(name.length());  // 取得字串長度

        System.out.println(name.toLowerCase());  // 轉小寫
        System.out.println(name.toUpperCase());  // 轉大寫

        // 取出特定字元
        System.out.println(name.charAt(3));  // 從字串中取出 s
        System.out.println(name.charAt(name.length()-1));  // 取出字串中最後一個字元 n

        // 取得某字串或某字元在字串中的位置(index)
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf("il"));  // 給出"il"字串開始的位置

        String age = "30";
        System.out.println(Integer.parseInt(age));  // 字串轉整數
    }
}
