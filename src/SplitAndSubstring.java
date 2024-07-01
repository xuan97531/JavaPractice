public class SplitAndSubstring {
    public static void main(String[] args) {
        String a = "Hello, I'm Xuan. Nice to meet you.";
        String s = "Hello";

        s = s.substring(0,4);

        System.out.println(s);

        String[] splitstring = a.split(" ");  // 使用空格作為分隔符來拆分字串

        for(String b : splitstring){
            System.out.println(b);
        }
    }
}
