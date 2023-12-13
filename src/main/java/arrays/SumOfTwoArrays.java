package arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int [] arr = {34,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        int [] temp = new int[5];
        int carry = 0;
        for(int i = 4 ; i>=0 ; i--){
            int sum = arr[i]+arr2[i];
            if(sum>9){
                int rem = sum%10;
                carry = sum/10;
                temp[i] = rem;
               if(i!=0) {
                   arr[i - 1] = arr[i - 1] + carry;
               }

            }else{
                temp[i] = sum;
            }
        }
        System.out.print(carry+" ");
        for(int x:temp){
            System.out.print(x+" "); //4 1 0 2 4 5
        }
    }
}
