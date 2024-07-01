public class ForLoop {
    public static void main(String[] args) {
        String[] friends = {"Mike", "Grace", "Jerry", "Brain"};
        String[] languages = {"C++", "Python", "Java", "Go"};

        // for-loop 方法一
        for(int i = 0; i < friends.length; i++){
            System.out.println(friends[i]+" is my firend");
        }

        System.out.println("");

        // for-loop 方法二
        for(String language: languages){
            System.out.println(language+" is a Program language");
        }


    }
}
