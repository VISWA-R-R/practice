package telegram.day11;

public class Secoundlagestarr {
    public static void main(String[] args) {
        int arr[]={10,20,4,45,99};
        int largest=Integer.MIN_VALUE;
        int secoundlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secoundlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>largest && arr[i]>secoundlargest){
                secoundlargest=largest;

            }
        }
        System.out.println(secoundlargest);
    }
}
