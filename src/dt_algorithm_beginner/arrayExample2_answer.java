package dt_algorithm_beginner;

import java.io.*;
import java.util.*;

public class arrayExample2_answer {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        //1. 10개의 데이터 입력받는다.
        for (int index = 0; index < arr.length; index++) {
            arr[index] = Integer.parseInt(buffer.readLine());   // 버퍼로 들어온 모든 인풋의 자료형은 스트링이다.
        }
        System.out.println(Arrays.toString(arr));

        // 2.총합을 구한다.
//        int total=0;
//        for (int index = 0; index < arr.length; index++) {
//            total += arr[index];
//        }
        //3. 최소값을 구한다.
//        int min = Integer.MAX_VALUE;
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] < min) {
//                min = arr[index];
//            }
//        }

        //2+3. 총합과 최소값을 구한다.
        int total = 0, min = Integer.MAX_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
            total += arr[index];
        }

//         min = arr[0];
//        for (int index = 1; index < arr.length; index++) {
//            if (arr[index] < min) {
//                min = arr[index];
//            }
//        }

      //  System.out.println(total); // 오류가능성 많은걸 많이 할 필요없음.
        StringBuffer stringBuffer =new StringBuffer(); // 여기에 저장해놨다가 한번만 출력할것임
        stringBuffer.append(total).append("\n").append(min);
        System.out.println(stringBuffer.toString());//나올만한 애들 다 준비해 놓고 out은 한번에
    }
}
