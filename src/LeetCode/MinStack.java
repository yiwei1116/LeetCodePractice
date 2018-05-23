package LeetCode;

public class MinStack {

    class Node{
        int val;
        int min;
        Node next;

        Node(int x, int min){
            this.val = x;
            this.min = min;
            next = null;
        }

    }
    Node head ;
    public void push(int x){
        if (head == null)
            head = new Node(x, x);
        else {
            Node n = new Node( x , Math.min(head.min,x));
            n.next = head;
            head = n ;

        }

    }
    public void pop(){
        if (head != null)
          head = head.next;
    }
    public int top(){
        if (head != null)
            return head.val;
        return -1;
    }
    public int getMin(){
        if (head != null)
            return head.min;
        return -1;
    }
}
