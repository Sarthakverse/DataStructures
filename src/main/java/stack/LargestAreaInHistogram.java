package stack;

import java.util.ArrayList;

//without using stack
public class LargestAreaInHistogram {
    public static void main(String[] args) {
        int [] arr = {6,9,5,4,5,10,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++)
        {
            if(i == 0)
            {
               int j =1;
               while(arr[i] < arr[j])
               {
                   j++;
               }
               list.add(arr[i]*j);
            }

            else if(i == arr.length -1)
            {
                int j = arr.length -2;
                int k =1;
                while(arr[i] < arr[j])
                {
                    j--;
                    k++;
                }
                list.add(k*arr[i]);
            }

            else{
                int advanceInRightSide =i+1;
                int kRight =0;

                while( advanceInRightSide<=(arr.length-1) && arr[i]<arr[advanceInRightSide] ){
                    advanceInRightSide++;
                    kRight++;
                }

                int advanceInLeftSide = i-1;
                int kLeft = 0;
                while(advanceInLeftSide>=(0) && arr[i] < arr[advanceInLeftSide]  ){
                    advanceInLeftSide--;
                    kLeft++;
                }
                list.add((kLeft+kRight+1)*arr[i]);
            }
        }
        System.out.println(list);
        int max = list.get(0);
        int listSize = list.size();
        int h =1;
        while(h!=listSize-1)
        {
            if(max<list.get(h)){
                max = list.get(h);
            }
            h++;
        }
        System.out.println("largest area of histogram is : "+max);
    }



}
