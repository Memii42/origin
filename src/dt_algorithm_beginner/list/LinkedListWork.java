package dt_algorithm_beginner.list;

public class LinkedListWork {

    public static class CustomLinkedList{
        private static class Node{
            // 객체 == 노드
            int value;
            Node pointer;

            public Node(int value) {
                this.value = value;
                this.pointer = null;
            }
        }

        private Node head; //list의 시작점
        private int size;

        public CustomLinkedList(){
            this.size = 0;
        }

        public void add(int value) {
            if (head == null) {
                head = new Node(value);
                /*STUDY: 내용정리
                Node 객체 = 값(vlaue) + 연결(pointer)

                 */

            }
        }

    }


    public static void maind(String[] args) {

        CustomLinkedList list = new CustomLinkedList();

        list.add(10);
    }



}
