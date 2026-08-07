package oops.singleinheritance;

class parants{
    static int a=20;
    public static void display1(){
        System.out.println("i am from parent");
    }
}

public class child extends parants {
    static int b=20;
    void child1(){
        System.out.println("i am from child non static method");
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        display1();

        
        child c=new child();
        c.child1();
       
        
    }
}
