    /* 사용자가 입력한 명령어에 따라 리스트 값을 추가/ 삭제 한다.
       명령어는 I (마지막에 입력; 양수만 가능), D(마지막 값 삭제), E(종료)로 진행되며,
       결과는 종료 이후에 가장 마지막 값, 모든 값, 사이즈를 출력한다.
       비어있다면 -1을 출력한다.
       단, D는 I의 횟수보다 더 많이 입력될 수 없다.
       자료구조는 직접만드는 것 보다 활용하는게 도움이 더 될 확률이 높음
     */
package dt_algorithm_beginner.list;

import java.util.*;
import java.io.*;

public class ListPractice1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();  //STUDY:GPT

        while(true){
            String line = br.readLine();
            //I  5  / D   / I   10/ I   7/ E
            /*STUDY: String -> Split ( 독스 검색)
                근데 왜 배열에 채워지지 않고 덮어써지지?
             */

            String[] detail = line.split(" "); //STUDY : regex(Regular Expresion) 정규표현식 " " 띄어쓰기를 기준으로 나눈다.

            if (detail[0].equals("E")) break; //STUDY: string 두개를 비교할때는 == 값을 비교할 수 없다. eaul은 주소값을 비교. equals는 값 비교
                                        // STUDY: 문자열은 비교(같음)== 사용불가 " .equals() "사용
            if(detail[0].equals("I")) {  //숫자값이 String으로 들어옴
                int value = Integer.parseInt(detail[1]); //실제 int 값
                list.add(value);
            } else if (detail[0].equals("D")){
                //STUDY: util.ArrayList의 remove() 독스 검색
                list.remove(list.size()-1);
            }
        }
        // 가장 마지막 값(비어있 -1)
        System.out.println("🏷️"+ (list.isEmpty() ? -1: list.get(list.size()-1)));
        //STUDY:  Arraylist -> isEmpty()

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
        StringJoiner sj = new StringJoiner(" "); //STUDY: StringJoiner 찾아보기,delimiter값으로 나눠준다.
        for (int data : list)
            sj.add(Integer.toString(data));
        fullData = sj.toString();
        }
            System.out.println("📎"+fullData);

        // 사이즈
        System.out.println(list.size());
    }


}
