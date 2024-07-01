public class IfStatement {
    public static void main(String[] args) {
        int age = 20;

        // 14歲以下 無行為能力者
        // 14-18歲 or 80歲以上 限制行為能力者
        // 18-80歲 完全行為能力者

        if(age < 14){
            System.out.println("無行為能力者");
        } else if ((age > 14 && age < 18) || age > 80) {
            System.out.println("限制行為能力者");
        }else{
            System.out.println("完全行為能力者");
        }
    }
}