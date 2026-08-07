// package oops.hibrideinheritance.java.grandchild2;
class parent{
    static int a=10;
    static void para(){
        System.out.println("i am from parent "+a);
    }
}
class child extends parent{
    static int b=20;
    static void c1(){
        System.out.println("i am from child "+b);
        System.out.println("i am from parent and child "+a);
    }
}

class grandchild1 extends child{
    static int c=30;
    static void gc1(){
        System.out.println("i am from parent and child and grandchild "+a);
        System.out.println("i am from child and grandchild "+b);
        System.out.println("i am from grandchild "+c);
    }
}

class Grandchild2 extends child {
    static int d=40;
    static void gc2(){
        System.out.println("i am from parent and child and grandchild2 "+a);
        System.out.println("i am from child and grandchild2 "+b);
        System.out.println("i am from grandchild2 "+d);
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(grandchild1.c);
        System.out.println(d);

        para();
        c1();
        grandchild1.gc1();
        gc2();
        
    }
}
