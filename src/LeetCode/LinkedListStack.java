package LeetCode;

import java.util.EmptyStackException;

public class LinkedListStack {
    public static class LinkListStack {
        private StackNode top;

        public class StackNode{
            int data;
            StackNode next;
            public StackNode(int dat){
                this.data = dat;
            }
        }
        public  LinkListStack(int data){
            top = new StackNode(data);
        }
        
        public void pop(){
            if (top == null)
                throw new EmptyStackException();
            top = top.next;
        }
        public void push(int data){
            StackNode newNode =  new StackNode(data);
            if (top == null)
            {
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }
        public int peek(){
            if (top == null)
                throw new EmptyStackException();
            return top.data;
        }
        public boolean isEmpty(){

               return top == null;

        }
        public void printStack(){
            if (top == null)
                throw new EmptyStackException();
            StackNode temp = top;
            while (temp != null){

                System.out.println(temp.data);
                temp = temp.next;

            }

        }


    }
}
