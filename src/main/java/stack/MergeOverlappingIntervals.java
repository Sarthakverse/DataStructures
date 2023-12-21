package stack;

import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int [][]arr = {{22,28},{1,8},{25,27},{14,19},{27,30},{5,22}};

        Pair []pairs = new Pair[arr.length];
        for(int i =0 ; i<arr.length ; i++)
        {
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0 ; i< pairs.length ; i++)
        {
            if(i==0){
                st.push(pairs[i]);
            }
            else{
                Pair top = st.peek();
                if(pairs[i].startTime>top.endTime){
                    st.push(pairs[i]);
                }
                else{
                    top.endTime  = Math.max(top.endTime, pairs[i].endTime);
                }
            }
        }

        Stack<Pair> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }

        while(!st2.isEmpty()){
            Pair p = st2.pop();
            System.out.println(p.startTime + " "+ p.endTime);
        }

    }
    public static class Pair implements Comparable<Pair>{
        int startTime;
        int endTime;
        Pair(int startTime , int endTime){
            this.endTime = endTime;
            this.startTime = startTime;
        }

        @Override
        public int compareTo(Pair other)
        {

            if(this.startTime != other.startTime) {
                return this.startTime-other.startTime;
            }
            else {
                return this.endTime-other.endTime;
            }

        }
    }
}


