package dt_algorithm_beginner;
import java.util.*;
import java.util.stream.*;
public class arrayExample1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

    int[] arr2 = {10, 30, 20};
    System.out.println(Arrays.toString(arr2));

    Random rand = new Random();
    int[] arr3 = new int[5];
        for (int index = 0; index < arr3.length; index++) {
            arr[index] = rand.nextInt(10);
        }
    System.out.println(Arrays.toString(arr3));


        byte[] randomBytes = new byte[5];
        rand.nextBytes(randomBytes);
    System.out.println(Arrays.toString(randomBytes));

        int[] arr4 = new int[5];
        Arrays.fill(arr4, 10);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = IntStream.range(0, 5).toArray();
        System.out.println(Arrays.toString(arr5));
    }
}
