package oops.polymorphism;
public class methodoverloading {

    // static void add(int a,int b){
    //     System.out.println(a+b);
    //     System.out.println("i am int "+a+b);//string to number = string
    // }
    // static void add(int c,int d,int e){
    //     System.out.println(c+d+e);
    // }
    // static void add(double a,double b){
    //     System.out.println(a+b);
    //     System.out.println("i am double "+a+b);//string to number = string
    // }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void sub(double a,double b){
        System.out.println(a-b);
    }
    void sub(int a,int b,int c){
        System.out.println(a-b-c);
    }

    public static void main(String[] args) {
        // add(10, 20);
        // add(10.30, 20);
        // add(10.5, 20.5);
        // add(10, 20, 30);

        methodoverloading m=new methodoverloading();
        m.sub(50,10);
        m.sub(50.0, 20.90);
        m.sub(50, 20, 100);

    }
    
}
