package arrays;

//                    *
//                    *
//                    * *
//                    * *
//              *     * *
//              *     * *
//              * *   * *
public class BarGraph {
    public static void main(String[] args) {
        int [] arr = {3,1,0,7,5};
        int size = arr.length;
        int max = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }

        for(int i=max ; i>0 ; i--){
            for(int j=0 ; j<size ;j++){
                 if(i == arr[j] || i<arr[j])
                 {
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
            }
            System.out.println();
        }
    }
}
