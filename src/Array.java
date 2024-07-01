public class Array {
    public static void main(String[] args) {
        // 創建Array的方法一
        String[] friends = {"Mike", "Grace", "Jerry", "Brain"};
        System.out.println(friends[0]);  // 印出Mike
        System.out.println(friends[friends.length - 1]); // 印出Brain

        // 創建Array的方法二
        String[] languages = new String[5];
        languages[0] = "C++";
        languages[1] = "Python";
        languages[2] = "Java";
        languages[3] = "Go";
        languages[4] = "JavaScript";
        System.out.println(languages[1]);  // 印出Python
        System.out.println(languages);     // 印出languages所在地址(16進制)

    }
}
