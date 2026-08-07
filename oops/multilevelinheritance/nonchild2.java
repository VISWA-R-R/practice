package oops.multilevelinheritance;


class nonparant{
    int a=10;
    void para(){
        System.out.println("this is my parent "+a);
    }
    static void para2(){
        nonparant p=new nonparant();
        System.out.println("this is from static parent "+p.a);
    }
}
class nonchild extends nonparant{
    int b=20;
    void child(){
        System.out.println("this is from 1st child "+b);
        System.out.println("this is from parent "+a);
    }
}

public class nonchild2 extends nonchild {
    int c=30;
    void child2(){
        System.out.println("this is from child 2 "+c);
        System.out.println("this is from child 1 "+b);
        System.out.println("this is from parent "+a);
    }
    public static void main(String[] args) {

        nonparant p =new nonparant();
        System.out.println(p.a);
        p.para();
        p.para2();
        System.out.println();

        nonchild nc=new nonchild();
        System.out.println(nc.a);
        System.out.println(nc.b);
        nc.para();
        nc.child();
        System.out.println();

        nonchild2 nc2=new nonchild2();
        System.out.println(nc2.a);
        System.out.println(nc2.b);
        System.out.println(nc2.c);
        nc2.para();
        nc2.child();
        nc2.child2();
        
    }
}
