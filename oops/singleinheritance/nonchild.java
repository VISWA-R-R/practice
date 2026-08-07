package oops.singleinheritance;

class parants2{
    int a=10;
    void parants1(){
        System.out.println("i am from non static parent "+a);
    }
}

public class nonchild extends parants2 {
    int b=20;
    void child1(){
        System.out.println("iam from non static child "+b);
    }
    public static void main(String[] args) {
        parants2 p =new nonchild();
        System.out.println(p.a);
        p.parants1();

        nonchild nc=(nonchild)p;
        System.out.println(nc.a);
        System.out.println(nc.b);
        nc.parants1();
        nc.child1();
        
    }
}
