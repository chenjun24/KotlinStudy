package com.cj.algorithmdemo.javatest;


import java.util.Arrays;

public class Test17 {
    /**
     输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

     示例 1：

     输入：arr = [3,2,1], k = 2
     输出：[1,2] 或者 [2,1]
     示例 2：

     输入：arr = [0,1,2,1], k = 1
     输出：[0]
     */
    public static void main(String[] args){
       int[] arr = {4,5,1,6,2,7,3,8};//43
        System.out.println("未排序："+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后："+ Arrays.toString(arr));
        System.out.println("数组中最小的4个数字："+ Arrays.toString(getLeastNumbers(arr,4)));
    }
   static  int count = 0;
    /**
     * 快速排序
     * @param num	排序的数组
     * @param left	数组的前针
     * @param right 数组后针
     *              4,5,1,6,2,7,3,8
     *              4 3 1 6 2 7 5 8
     *              4 3 1 2 6 7 5 8
     *
     */
    private static void quickSort(int[] num, int left, int right) {
        if (left>=right){
            return;
        }
        int key = num[left];
        int i = left;
        int j = right;
        while (i<j){
            while (num[j]>=key && i<j){
                j--;
            }
            //System.out.println("quickSort  j:"+j);
            while (num[i]<=key && i<j){
                i++;
            }
            //System.out.println("quickSort i:："+ i);
            if(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        num[left] = num[i];
        num[i] = key;
        count++;
        quickSort(num,left,i-1);
        quickSort(num,i+1,right);
    }


    public static int[] getLeastNumbers(int[] arr, int k) {
         int[] res = new int[k];
         for (int i=0;i<k;i++){
             res[i] = arr[i];
         }
        return res;
    }
}
