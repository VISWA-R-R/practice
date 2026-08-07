package oops.polymorphism;

class parent{
    void bike(){
        System.out.println("this is parent bike");
    }
}

public class child2 extends parent{
    // @Override
    void bike(){
        System.out.println("this is child bike");
    }
    public static void main(String[] args) {
        // parent p =new parent();
        // p.bike();

        // child2 c=new child2();
        // c.bike();

        parent p=new child2();
        p.bike();
        
    }
}
