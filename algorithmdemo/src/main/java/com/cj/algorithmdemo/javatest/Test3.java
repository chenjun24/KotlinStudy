package com.cj.algorithmdemo.javatest;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * 示例:
     *
     * 现有矩阵 matrix 如下：
     *
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     * 给定 target = 5，返回 true。
     *
     * 给定 target = 20，返回 false。
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args){//18
      int[][] arr = {{1, 4, 7, 11, 15,17},//0,5  1,5 , 1,4 ,1,3 ,2,3, 3,3 ,4,3 4,2,4,1
                     {2, 5, 8, 12, 19,22},
                     {3, 6, 9, 16, 22,28},
                     {10, 13, 17, 23, 24,34},
                     {18, 21, 23, 26, 30,40}};
        //System.out.println(findNumberIn2DArray(arr,400));
        System.out.println(findNumberIn2DArray1(arr,40));
    }

   public static boolean findNumberIn2DArray(int[][] arr, int target){
       //System.out.println(arr[0].length);
        for (int i =0;i<arr.length;i++){
             for (int j =0;j<arr[i].length;j++){
                 //System.out.println(arr[i][j]);
                 if(arr[i][j] == target){
                     return true;
                 }else if(arr[i][j]>target){
                     break;
                 }
             }
        }
        return false;
   }

    public static boolean findNumberIn2DArray1(int[][] arr, int target){
       // int rows = arr.length;int columns = arr[0].length;
        int row = 0;int column = arr[0].length -1;
        while (row<arr.length && column>0){
            if(arr[row][column] == target){
                return true;
            }
            if(arr[row][column] > target){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }

}
