package telegram.day19;

import java.util.Arrays;

public class Medianofthelist {
    public static void main(String[] args) {
        int list[]={3,1,4,1,5};
        int median;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(list[i]<list[j]){
                    int temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        median=list[list.length/2];
        System.out.println(median);
    }
}
