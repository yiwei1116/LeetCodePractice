package LeetCode;

public class OverloadvsOverride {


    class A{

        void test(){
            System.out.println("A");
        }

    }
    class B extends A{
        // override
        void test(){
            System.out.println("B");
        }
        // overload
        void test(char c){
            System.out.println(c);
        }



    }
}
