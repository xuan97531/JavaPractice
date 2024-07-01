public class MethodOverload {

    public MethodOverload() {}

    // 方法多載
    public void addition(int a, int b){
        System.out.println("Int addition "+a+b);
    }

    public void addition(String a, String b){
        System.out.println("String addition "+a+b);
    }
    public static void main(String[] args) {
        MethodOverload m = new MethodOverload();
        m.addition(3, 5);
        m.addition("Hello", " World");
    }
}
