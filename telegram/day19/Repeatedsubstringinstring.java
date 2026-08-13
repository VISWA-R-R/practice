package telegram.day19;

public class Repeatedsubstringinstring {
    public static boolean isRepeated(String str){
        int n=str.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String sub=str.substring(0,i);
                StringBuilder result=new StringBuilder();
                for(int j=0;j<n/i;j++){
                    System.out.println(result);
                    System.out.println(sub);
                    result.append(sub);
                }
                if(result.toString().equals(str)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="abab";
        System.out.println(isRepeated(str));
    }
}
