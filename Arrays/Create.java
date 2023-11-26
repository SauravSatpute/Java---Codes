package Arrays;

public class Create {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<10;i++) {
            arr[i] = i*i;
        }

        for(int i=0;i<10;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
