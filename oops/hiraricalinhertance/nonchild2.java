package oops.hiraricalinhertance;

class nonparent{
    int a=10;
    void para(){
        System.out.println("i am from parent "+a);
    }
}

class nonchild1 extends nonparent{
    int b=20;
    void c1(){
        System.out.println("i am from child 1 "+b);
        System.out.println("i am from parent "+a);
    }
}

public class nonchild2 extends nonparent {
    int c=30;
    void c2(){
        System.out.println("i am from child 2 "+c);
        // System.out.println("i am from child 2 "+b);❌
        System.out.println("i am from parent "+a);
    }
    public static void main(String[] args) {
       nonparent p=new nonparent();
       System.out.println(p.a);
       p.para();
       System.out.println();

       nonchild1 nc1=new nonchild1();
       System.out.println(nc1.a);
       System.out.println(nc1.b);
       nc1.para();
       nc1.c1();
       System.out.println();

       nonchild2 nc2=new nonchild2();
       System.out.println(nc2.a);
       System.out.println(nc2.c);
       nc2.para();
       nc2.c2();
    }
}

