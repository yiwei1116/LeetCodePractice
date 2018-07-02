package LeetCode;

import java.security.PublicKey;
import java.util.HashSet;


/**
 * Created by yiwei on 2018/6/29.
 */public class LinkedList
{
    //Class variables for the Linked List
    private  Node head;
    private static int numNodes;

    public static void main(String [] args)
    {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll = new LinkedList(10);
        ll.addAtHead(11);
        ll.addAtHead(12);
        ll.addAtHead(13);
        ll.addAtTail(8);
        ll.addAtTail(7);
        ll.addAtHead(11);
        ll.addAtIndex(4,9);
        ll.addAtIndex(4,9);

        ll.printList();
        System.out.println("=======");

    }
    public static LinkedList sumAsLinkedList(LinkedList l1, LinkedList l2){

        if (l1 == null || l2 == null)return null;
        LinkedList sumll = null;
        Node h1 = l1.getHead();
        Node h2 = l2.getHead();
        int c = 0;
        while (h1!=null && h2!=null)
        {
            int mod = (c + h1.getData() + h2.getData());

            if ( mod > 9){
                 mod = mod % 10;

                c = 1;
            }
            else {

                c = 0;
            }
            if (sumll==null)sumll = new LinkedList(mod);
            else  sumll.addAtTail(mod);
            h1 = h1.next;
            h2 = h2.next;
        }

        while (h1!= null){

            sumll.addAtTail(c+h1.getData());
            h1 = h1.next;
            c = 0 ;

        }
        while (h2!= null){

            sumll.addAtTail(c+h2.getData());
            h2 = h2.next;
            c = 0;
        }
        if (c==1)
            sumll.addAtTail(1);
        return sumll;

    }
    public void printDoubleLinkedList(){
        Node temp = head;
        while ( temp.next != null ) temp = temp.next;

        while (temp!= null)
        {
            System.out.println(temp.getData());
            temp = temp.prev;

        }



    }
    public void DeleteMidNode(Node dNode){
        Node temp = head;
        if (temp == null)return ;
        while (temp.next != null){
            if (temp.next == dNode && temp.next.next != null){
                temp.next = temp.next.next ;
                return;
            }
            temp = temp.next;
        }
    }

    public LinkedList(int dat)
    {
        head = new Node(dat);
    }

    public void addAtHead(int dat)
    {
        Node temp = new Node(dat);
        if (head == null) head = temp;

        else
        {
            temp.next = head;
            head = temp;
        }
        numNodes++;
    }
    // Double linked list function
    public void addAtTail(int dat)
    {



        if (head ==null)
        {
            head = new Node(dat);
            return;
        }
        Node temp = head;
        Node newNode = new Node(dat);
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        numNodes++;
    }

    public void addAtIndex(int index, int dat)
    {
        Node temp = head;
        Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(dat);
        temp.next.next = holder;
        numNodes++;
    }

    public void deleteAtIndex(int index)
    {
        Node temp = head;
        for(int i=0; i< index - 1 && temp.next != null; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }
    public Node deleteNode(Node head, int i){

        Node temp = head;

        if ((int)temp.getData()== i )
            return head.next;
        while (temp.next!=null){

            if ((int)temp.next.getData()==i){

                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }

        return head;



    }
    public void deleteDuplicates(Node node){
        Node prev = null;
        HashSet checkT = new HashSet();
        while (node != null){
            if (checkT.contains(node.data)){
                prev.next = node.next;
            }else {
                checkT.add(node.data);
                prev = node;
            }

                node = node.next;

        }

    }
    //  1 2 3 4 5 6 7 null
    //if k = 2, return node 5
    // two pointer from first we need to count k-2 element

    public Node findKthToLastElement(Node head, int index){
        Node curr = head;
        Node follower = head;


        for (int i = 0 ; i < index ; i++){

            if (curr == null )return null;

            curr = curr.next;
        }
        while (curr.next!=null)
        {
            curr = curr.next;
            follower = follower.next;
        }
        return follower;



    }
    public void reverseLinkedList(){

        Node cur = head;
        Node prev = null;
        Node next ;
        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        head = prev;

    }
    public void recurReverseLinkedList(Node temp){


        if (temp.next == null)
        {
            head = temp;
            return;
        }
        recurReverseLinkedList(temp.next);
        Node q = temp.next;
        q.next = temp;
        temp.next = null;

    }

    public Node find(int index)
    {
        Node temp= head;
        for(int i=0; i<index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public  void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void recursionReversePrint(Node node){

        if (node.next != null)
            recursionReversePrint(node.next);


        System.out.println(node.getData());


    }
    public Node getHead(){

        return head;
    }

    public static int getSize()
    {
        return numNodes;
    }

    public class Node
    {
        //Declare class variables
        private Node next = null;
        private int data;
        private Node prev =  null;
        public Node(int dat)
        {
            data = dat;
        }

        public int getData()
        {
            return  data;
        }
    }
}