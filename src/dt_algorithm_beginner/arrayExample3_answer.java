package dt_algorithm_beginner;

import java.io.*;

public class arrayExample3_answer {
    public static final String ENTER = "\n";

    public static void main(String[] args) throws IOException {
        //1. 사용자가 원하는 개수를 입력받고
        //2. 연달아오는 개수만큼의 값으로 초기화 한다.
        //3. 합, 평균, 최소, 최대값을 순서대로 출력한다.

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(buff.readLine());
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(buff.readLine()); // buff는 한번 만들면 계속 쓸 수 있는건가?
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            else if(arr[i] > max) max = arr[i];
            total += arr[i];
        }
        double average = total/ size;

        StringBuffer sbuff =new StringBuffer();
        sbuff.append(total).append(ENTER).append(average).append(ENTER)
                .append(min).append(ENTER).append(max);
        System.out.println(sbuff); //toString() 왜 넣는거지

    }
}
