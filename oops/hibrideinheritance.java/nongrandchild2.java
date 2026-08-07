// package oops.hibrideinheritance.java.grandchild2;
class nonparent{
    int a=10;
    void para(){
        System.out.println("i am from parent "+a);
    }
}
class nonchild extends nonparent{
    int b=20;
    void c1(){
        System.out.println("i am from child "+b);
        System.out.println("i am from parent and child "+a);
    }
}

class nongrandchild1 extends nonchild{
    int c=30;
    void gc1(){
        System.out.println("i am from parent and child and grandchild "+a);
        System.out.println("i am from child and grandchild "+b);
        System.out.println("i am from grandchild "+c);
    }
}

class nongrandchild2 extends nonchild {
    int d=40;
    void gc2(){
        System.out.println("i am from parent and child and grandchild2 "+a);
        System.out.println("i am from child and grandchild2 "+b);
        System.out.println("i am from grandchild2 "+d);
    }
    public static void main(String[] args) {
        nonparent p=new nonparent();
        System.out.println(p.a);
        p.para();
        System.out.println();

        nonchild nc=new nonchild();
        System.out.println(nc.a);
        System.out.println(nc.b);
        nc.para();
        nc.c1();
        System.out.println();

        nongrandchild1 ng1=new nongrandchild1();
        System.out.println(ng1.a);
        System.out.println(ng1.b);
        System.out.println(ng1.c);
        ng1.para();
        ng1.c1();
        ng1.gc1();
        System.out.println();

        nongrandchild2 ng2=new nongrandchild2();
        System.out.println(ng2.a);
        System.out.println(ng2.b);
        System.out.println(ng2.d);
        ng2.para();
        ng2.c1();
        ng2.gc2();

        
    }
}
