public class RecursionMethod {
    public static void printHi(int i){
        if(i == 0) {
            return;
        }
        System.out.println("We just enter printHi with i is "+i);
        printHi(i-1);
        System.out.println("We finished running printHi with i is "+i);
    }
    public static void main(String[] args) {
        printHi(5);
    }
}
