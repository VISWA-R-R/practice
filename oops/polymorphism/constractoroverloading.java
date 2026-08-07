package oops.polymorphism;

public class constractoroverloading {

    constractoroverloading() {
        System.out.println("this is no argument constractor");
    }
    constractoroverloading(int a){
        System.out.println("this is one argument constractor "+a);
    }
    constractoroverloading(int a,int b){
        System.out.println(a+b+" this is two ardument constractor");
    }
    public static void main(String[] args) {
        constractoroverloading c = new constractoroverloading();
        constractoroverloading c2 = new constractoroverloading(10);
        constractoroverloading c3 = new constractoroverloading(10,30);
    }
    
}
