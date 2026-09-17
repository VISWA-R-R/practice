package praticejava.day35;

import java.util.Arrays;

public class Temperatureincrease {
    public static void main(String[] args) {
        int temp[]={24,25,20,19,26,30};
        int temp2[]=new int[temp.length];
        int count=0;
        int k=0;
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[j]>temp[i]){
                    count++;
                }
                else{
                    temp2[k]=count;
                    k++;
                    count=0;
                }
                   
            }
        }
        System.out.println(Arrays.toString(temp2));
    }
}
