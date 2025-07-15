/* 방금 입력한 문제에 I의 형식을 바꾼다.
  I다음에는 값과 위치를 넣는다.
  위치가 입력되지 않거나 사이즈보다 큰 값이면, 가장 뒤에 값을 넣는다.
 */

package dt_algorithm_beginner.list;
import java.util.*;
import java.io.*;

public class ListPractice2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while(true){
            String line = br.readLine();


            String[] detail = line.split(" ");

            if (detail[0].equals("E")) break;
            if(detail[0].equals("I")) {  //숫자값이 String으로 들어옴
                int value = Integer.parseInt(detail[1]); //실제 int 값
                if (detail.length == 3) {
                    int index = Integer.parseInt(detail[2]);//STUDY:.size랑 .length랑 무슨차이?
                    list.add(index, value);
                }else {
                    list.add(value);  //STUDY: list -add() 독스 검색
                }
            } else if (detail[0].equals("D")){
                list.remove(list.size()-1);
            }
        }
        // 가장 마지막 값(비어있 -1)
        System.out.println("🏷️"+ (list.isEmpty() ? -1: list.get(list.size()-1)));

        // 모든 값(비어 -1)
        // [Ver1]
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//            if (i < list.size() -1) System.out.print(", ");
//        }
//        System.out.println();

        //[Ver2]
        String fullData = null;
        if (list.isEmpty()) fullData = "-1";
        else {
            StringJoiner sj = new StringJoiner(" ");
            for (int data : list)
                sj.add(Integer.toString(data));
            fullData = sj.toString();
        }
        System.out.println("📎"+fullData);

        // 사이즈
        System.out.println(list.size());
    }


}
/* STUDY:
- 자료구조의 동작: CS지식/면접때 많이 사용할 수 있다.
- 알고리즘 문제풀이 한다 -> 자료구조 만들고 있으면 안됨. 알고있는거 적용해서(자료구조 선택후 빠르게 푼다.)
-
 */

