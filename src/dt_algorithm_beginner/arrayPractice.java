package dt_algorithm_beginner;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arrayPractice {
    // 사용자에게 데이터의 크기를 입력받고, 값을 0~10 내로 랜덤하게 초기화 하라.
    // 마지막엔 특정 숫자를 입력받아, 해당 숫자의 개수를 출력하라.


    // 사용자에게 입력(input)을 받는다.
    // 결과를 출력(output)한다.
    // >IO (input / output)
    // 오류의 가능성을 갖고 있다.(인아웃풋을 진행하면 꼭 IOException 처리해야함)

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.print("* 배열의 크기를 입력하세요:");
        int arraySize = sc.nextInt();
        int[] arr1 = new int[arraySize];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] =ra.nextInt(11);
        }

        System.out.print("* 찾고자 하는 숫자:");
        int target = sc.nextInt();

        int count = 0;  // 이 부분 못쓴 코드
        for(int num : arr1){
            if( num == target) count++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("숫자:"+ target +" 개수:"+count);


    }
}
