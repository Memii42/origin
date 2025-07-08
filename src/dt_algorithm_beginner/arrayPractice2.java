package dt_algorithm_beginner;

import java.util.Scanner;
import java.util.Arrays;
public class arrayPractice2 {
    // 03. 사용자가 원하는 개수를 입력받고, 연달아오는 개수만큼의 값으로 초기화합니다.
    //      합/평균/최소/최대값을 순서대로 출력하세요
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("*배열 개수 입력:");
        int input = sc.nextInt();
        int[] arr1 = new int[input];

        int sum = 0;
        double average;

        System.out.print("초기화 값 입력:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
            sum += arr1[i];
        }
        int maximum = arr1[0];
        int minimum = arr1[0];

        System.out.println(Arrays.toString(arr1));

        average = sum/input;

        for (int j=0; j< arr1.length; j++) {
            if(arr1[j] < minimum){
                minimum = arr1[j];
            }
        }for (int j=0; j< arr1.length; j++) {
            if(arr1[j] > maximum){
                maximum = arr1[j];
            }
        }

        System.out.println("합: "+sum+"   평균: "+average+"   최소: "+minimum+"   최대: "+maximum);


    }
}
