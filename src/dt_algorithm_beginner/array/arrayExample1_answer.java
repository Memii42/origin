package dt_algorithm_beginner.array;

import java.io.*;
import java.util.*;

public class arrayExample1_answer {
    public static void main(String[] args) throws IOException {
        // 사용자에게 입력(input)받는다. *입력을 받을때는 항상 오류처리를 붙여줘야한다.
        // 결과를 출력(output)한다.
        // > IO (input/output)
        // 오류의 가능성을 갖고있다.
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // 1. 사용자에게 배열의 크기를 입력받는다.
        int size = Integer.parseInt(buffer.readLine());

        int[] arr = new int[size];

        // 2. 랜덤하게 배열을 초기화 한다.
        Random ran = new Random();
        for (int index = 0; index < arr.length; index++) {
            arr[index] = ran.nextInt(10);
        } System.out.println(Arrays.toString(arr));

        // 3. 사용자에게 특정 숫자를 입력받는다.
        int findNum = Integer.parseInt(buffer.readLine()); //out,int 으로 들어오는 모든 데이터는 항상 String

        // 4. 개수를 세어 출력한다.
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == findNum)count++;
            //if (arr[index] != findNum) continue++;
            //count++;
        }
        System.out.println(count);
    }
    }
