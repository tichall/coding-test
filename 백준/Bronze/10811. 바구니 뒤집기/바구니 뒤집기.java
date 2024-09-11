import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = i + 1;
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while(i < j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }

        sc.close();

        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}
