package arrays;

import java.util.Scanner;

public class FindElementsOfArray {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int [] arr ={1,2,3,4,1,6,7,1,9};
        for(int i=0 ;i<8 ;i++)
        {
            if(arr[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
