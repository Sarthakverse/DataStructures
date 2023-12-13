package arrays;

import java.util.Scanner;

public class DifferenceOfArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of first array ");
        int n1 = s.nextInt();
        int []ar1 = new int[n1];
        for(int i=0 ;i<n1 ;i++){
            System.out.print("enter the "+i+"th element");
            ar1[i] = s.nextInt();
        }
        System.out.print("enter the size of second array ");
        int n2 = s.nextInt();
        int []ar2 = new int[n2];
        for(int i=0 ; i<n2 ;i++)
        {
            System.out.print("enter the "+i+"th element");
            ar2[i]=s.nextInt();
        }

        int [] temp = new int[n1]; //considering n1>n2
        int carry = 0;
        int i = ar1.length-1;
        int j = ar2.length-1;
        int k = ar1.length-1;
        while(j>=0)
        {
            int d1 = ar1[i];
            int d2 = ar2[j];
            d1 = d1 + carry;
            if(d1>=d2){
                int diff = d1-d2;
                carry = 0;
                temp[k] = diff;
            }else{
                int diff = d1+ 10 - d2;
                carry = -1;
                temp[k] = diff;
            }
            j--;
            i--;
            k--;
        }
        int lengthDiff = n1-n2;
        temp[lengthDiff-1] = ar1[lengthDiff-1]+carry;
        for(int l = 0 ;l <lengthDiff-1 ; l++){
            temp[l]=ar1[l];
        }
        int index=0;
      for(int m=0 ; m<temp.length ; m++){
          if(temp[m] != 0){
              index = m;
              break;
          }
      }

      for(int z= index ; z< temp.length ;z++){
          System.out.print(temp[z]+" ");
      }


    }
}
