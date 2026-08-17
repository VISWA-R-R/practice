package telegram.day23;

public class Findthedifferentbetweensumofevenandodd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sumeven=0;
        int sumodd=0;
        int different;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumeven=sumeven+arr[i];
            }
            else{
                sumodd=sumodd+arr[i];
            }
        }
        different=sumeven-sumodd;
        System.out.println(sumeven);
        System.out.println(sumodd);
        System.out.println(different);
    }
}
