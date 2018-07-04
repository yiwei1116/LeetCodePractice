package LeetCode;

import java.util.NoSuchElementException;

public class MyQueue {
    private static class QueueNode{

        private int data;
        private QueueNode next;

        public QueueNode(int data){
            this.data = data;
        }
        private QueueNode first;
        private QueueNode last;

        public void add(int data){
            QueueNode temp = new QueueNode(data);
            if (last != null) {
                last.next = temp;
            }
            last = temp;
            if (first == null)
                first = last;
        }
        public int remove(){
            if (first == null) throw new NoSuchElementException();

            int dNode = first.data;
            first = first.next;
            if (first == null)
                last = null;
            return dNode;
        }
        public int peek(){
            if (first == null) throw new NoSuchElementException();

                return first.data;
        }
        public boolean isEmpty(){

            return first == null;
        }




    }
}
