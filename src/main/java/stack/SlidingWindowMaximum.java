package stack;
// without stack

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12};
        int[] temp = new int[arr.length-4];
       for(int i=0 ; i<arr.length-4 ; i++)
       {
           int max = arr[i];
           for(int j=i ; j<i+4 ; j++)
           {
               if(max < arr[j])
               {
                   max = arr[j];
               }
           }
           temp[i] = max;
       }
        for(int x:temp)
        {
            System.out.print(x+" ");
        }
    }
}
