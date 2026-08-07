package oops.encapsulation;

public class Savestudent {
    public static void main(String[] args) {
        Studentdetail sd=new Studentdetail();
        sd.setName("viswa");
        sd.setAge(21);
        sd.setRegno(221061101);
        System.out.println(sd.getName());
        System.out.println(sd.getAge());
        System.out.println(sd.getRegno());
    }
}
