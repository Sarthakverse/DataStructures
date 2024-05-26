package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LeastAndMaxNumberWhoseSumOfDigitIsEqualToTarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        for(int i = (int) Math.pow(10,n-1); i<Math.pow(10,n) ; i++)
        {
            if(i%10 != 0)
            {
                if(findSum(i) == target)
                {
                    list.add(i);
                }
            }

        }

        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        list.clear();

    }

    private static int findSum(int i) {
        int sum =0;
        while(i!=0)
        {
            int rem = i%10;
            sum = sum +rem;
            i = i/10;
        }
        return sum;
    }
}
