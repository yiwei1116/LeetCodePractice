package LeetCode;

import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * Created by yiwei on 2018/6/28.
 */
public class ImplementLinkList {
    private static Node head;
    private static int numNode;



    class Node {

        private Node next;
        private Object data;

        public Node (Object dat){

            data = dat;
        }
        public Object getData(){

            return data;

        }


    }

    public void LinkedList(Object dat){

        head = new Node(dat);

    }
    public void addAtHead(Object dat){

        Node temp = head;
        head = new Node(dat);
        head.next = temp;
        numNode++;

    }
    public void addAtTail(Object dat){

        Node temp = head;
        Node tail = new Node(dat);

        while (temp!=null){
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









}
