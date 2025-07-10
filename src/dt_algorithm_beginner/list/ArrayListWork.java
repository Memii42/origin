package dt_algorithm_beginner.list;
import java.util.*;


public class ArrayListWork {
    public static class CustomArrayList {
    private int defaultSize = 10;
    private int[] data;
    private int index = 0; //현재 실제로 저장된 데이터의 개수를 나타내는 논리적 개념임

    public CustomArrayList(){
        data = new int[defaultSize];
    }

    public CustomArrayList(int size) {
        data = new int[size];
    }

    public void add(int value) {
        //인덱스 값을 확인하는 작업. 늘려줘야하는지 등
        resizeDataSize();
        data[index] = value;
        index++;
    }

    public void add(int value, int target) {

        if (target < 0 || target > index) {
            System.out.println("💥인덱스 범위 초과");
            return;
        }
        resizeDataSize();
        for (int i = index; i > target; i--) {
            data[i] = data[i - 1];
        }
        data[target] = value;
        index++;
    }

    public int remove() { // 가장 뒤에있는거 삭제하고 다시 삭제된 위치로 커서 가리키게
        index--;
        return index;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.index) {
            System.out.println("인덱스 범위 초과");
            return;
        }
        for (int i = index; i < this.index; i++) {
            data[i] = data[i+1];
        }
        this.index--;
    }

    public int get(int index) {
        //원래는 리턴값을 integer값을 주면서해야한다.
        //index 범위 체크가 있어야 디테일 완성
        return data[index];
    }

    private void resizeDataSize() {
        if (data.length > index) return;
        int newSize = data.length *2;
        int[] newArr = new int[newSize];

        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
            data = newArr;
        }
        System.out.println(index);
    }

    public void get() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < index; i++) // for while if (제어문) 실행할 코드가 한줄이면 중괄호 생략가능
            sb.append(i).append("");
        System.out.println(sb.toString()+"index: "+index);

    }

    public void print() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < index; i++) {
            sb.append(data[i]);
            if(i < index-1) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString() + "인덱스: " + index);
        System.out.println("⭕"+Arrays.toString(data));
    }
}

    public static void main(String[] args){
        CustomArrayList list1 = new CustomArrayList();
        list1.print();
        System.out.println();

        list1.add(10); // 10, 2번째 위치에 넣고 싶다. 만들어보면 좋아
        list1.print();
        System.out.println();

        list1.add(5);
        list1.print();
        System.out.println();

        list1.remove();// 1, 1번째 위치를 삭제하고 싶다. 라는거 만들어보면좋음
        list1.print();
        System.out.println();

        list1.add(3);
        list1.print();
        System.out.println();

        list1.add(3, 0);
        list1.print();

        list1.add(7, -1);
        System.out.println();


        list1.remove(0);
        list1.print();
        System.out.println(list1.get(0));
    }

}
