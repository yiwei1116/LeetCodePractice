package LeetCode;

import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * Created by yiwei on 2018/6/28.
 */
  public class UserLinkedList {
      // even if function exit, static will still exist in memory
    private static Node head;
    private static int numNode;




     public class Node {

        private Node next;
        private Object data;

        public Node (Object dat){

            data = dat;
        }
        public Object getData(){

            return data;

        }


    }


    public UserLinkedList(Object dat){

        head = new Node(dat);

    }
    public  void addAtHead(Object dat){

        Node temp = head;
        head = new Node(dat);
        head.next = temp;
        numNode++;

    }
    public  void addAtTail(Object dat){

        Node temp = head;
        Node tail = new Node(dat);

        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = tail;
        numNode++;
    }
    public void addAtIndex(int index, Object dat){
        Node temp = head;
        Node holder ;
        for (int i = 0 ; i < index-1 && temp.next!=null; i++){

            temp = temp.next;


        }

            holder = temp.next;
            temp.next = new Node(dat);
            temp.next.next = holder;
            numNode++;

    }

    public void deleteAtIndex(int index){

        Node temp = head;
        for (int i =0 ; i < index - 1 ; i++){

            temp = temp.next ;

        }
        temp.next = temp.next.next;
        numNode--;
    }
    public static int find(Node n){

        Node temp = head;
        int index = 0 ;
        while (temp != n && temp == null){

            temp = temp.next;
            index++;

        }
        if (temp == null) return -1;
        return index;

    }
    public static Node find (int index){

        int x = 0;

        Node temp = head;

        if (index > numNode)return null;

        while ( x < index){

            x++;
            temp = temp.next;

        }

        return temp;

    }
    public void printList(){

        Node temp = head;

        while (temp!=null){

            System.out.println(temp.data);
            temp = temp.next;


        }
            System.out.println();



    }




}
