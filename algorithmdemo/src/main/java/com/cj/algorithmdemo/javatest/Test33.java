package com.cj.algorithmdemo.javatest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test33 {
    /**

     */
    public static void main(String[] args) {

        //System.out.println(missingNumber(arr));
        findContinuousSequence1(10);
    }
   //1 2 3 4 5 6 7 8 9
    public int[][] findContinuousSequence(int target) {
        int i = target-1;
        while (i>0){

        }
        return null;
    }
    //1 2 3 4 5 6 7 8 9
    public static int[][] findContinuousSequence1(int target) {

        List<int[]> result = new ArrayList<>();
        int i = 1;

        while(target>0)
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("target:"+target+"   i:"+i);
            target -= i++;
            System.out.println("target:"+target+"   i:"+i);
            if(target>0 && target%i == 0)
            {

                int[] array = new int[i];
                System.out.println("--------(target/i):"+target/i+"  (target/i+i):"+(target/i+i));
                for(int k = target/i, j = 0; k < target/i+i; k++,j++)
                {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);
    }
}
