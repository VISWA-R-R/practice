package oops.multilevelinheritance;
class parants{
    static int a=10;
    public static void para(){
        System.out.println("i am from parent "+a);
    }
    void para2(){
        System.out.println("i am from parent 2 "+a);
    }
}
class child1 extends parants{
    static int b=20;
    public static void c1(){
        System.out.println("i am from child1 "+b);
        System.out.println("this is from parent "+a);
        // System.out.println();
    }
}

public class child2 extends child1 {
    static int c=30;
    public static void c2(){
        System.out.println("i am from child2 "+c);
        System.out.println("i am from child1 "+b);
        System.out.println("i am from parent "+a);
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        para();
        parants p=new parants();
        p.para2();
        System.out.println();
        c1();
        System.out.println();
        c2();
        
    }
}
