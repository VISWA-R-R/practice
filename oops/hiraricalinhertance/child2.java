package oops.hiraricalinhertance;

class parent{
    static int a=10;
    static void para(){
        System.out.println("i am from parent "+a);
    }
}

class child1 extends parent{
    static int b=20;
    static void c1(){
        System.out.println("i am from child 1 "+b);
        System.out.println("i am from parent "+a);
    }
}

public class child2 extends parent {
    static int c=30;
    static void c2(){
        System.out.println("i am from child 2 "+c);
        System.out.println("i am from parent "+a);
    }
    public static void main(String[] args) {
       System.out.println(a);
    //    System.out.println(b); ❌
       System.out.println(child1.b);
       System.out.println(c);

       para();
    //    c1();❌
       child1.c1();
       c2();
    }
}
