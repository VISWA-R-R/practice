package revision.string;

public class palingrom {
    public static void main(String[] args) {
        String str="racecar";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }


    }
}
