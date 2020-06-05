import java.util.*;

public class NextFit {
    public static void main(String[] args) {
        int[] items = {7, 5, 6, 4, 2, 3, 7, 5};
        int temp = 10;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }

        int k = 0;
        int remain = 10;
        for(int i = 0; i < items.length; i++) {
            if(items[i] <= remain) {
                arr[k] += items[i];
                remain -= items[i];
            }
            else {
                arr[++k] += items[i];
                remain = 10;
                remain -= items[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                int remainCapacity = 10 - arr[i];
                System.out.println("Bin{currentCapacity="+arr[i]+", remainCapacity="+remainCapacity+"}");
            }
        }
    }
}