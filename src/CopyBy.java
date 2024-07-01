public class CopyBy {
    public static void changeFirstElement(int[] arr){
        arr[0] = 1000;
    }

    public static void main(String[] args) {
        int[] myArray1 = {10, 20, 30};
        changeFirstElement(myArray1);
        for(int i : myArray1){
            System.out.print(i+" ");
        }
    }
}