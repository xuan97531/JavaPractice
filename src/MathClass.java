public class MathClass {
    public static void main(String[] args) {
        // 常用數 PI, E
        System.out.println(Math.PI);
        System.out.println(Math.E);

        int x = 28;
        int y = 4;

        // 找出最大值
        System.out.println("The max number is: "+Math.max(x,y));
        // 找出最小值
        System.out.println("The min number is: "+Math.min(x, y));

        double z = 3.54;

        // 無條件捨去
        System.out.println("無條件捨去後: "+Math.floor(z));
        // 無條件進位
        System.out.println("無條件進位後: "+Math.ceil(z));

        // 開根號
        System.out.println("z 開根號後為 "+Math.sqrt(z));

        // 次方
        System.out.println("x(28)的y(4)次方: "+Math.pow(x, y));

        // 取以自然對數基數e(約等於2.718282)為底的對數
        System.out.println("y取以自然對數為底log為: "+Math.log(y));
        // 取以10為底的對數
        System.out.println("y取以10為底的log為: "+Math.log10(y));
    }
}
