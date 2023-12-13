package arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0 ;i<5 ;i++){
            System.out.print("enter "+i+"th element: ");
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=1 ;i<5 ;i++){
            if(max<arr[i]){
                max = arr[i];
            }else{
                continue;
            }
        }

        for(int i=1;i<5 ;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print(max-min);
    }
}
