package com.cj.algorithmdemo.javatest;


import android.widget.FrameLayout;

public class Test23 {
    /**
     在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，
     并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？

     示例 1:

     输入:
     [
       [1,3,1],
       [1,5,1],
       [4,2,1]
     ]
     输出: 12
     解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
     1,4,5
     2,5,1
     6,2,1

     1,4,5
     2,9,10
     6,11,12
     */
    public static void main(String[] args) {
       // System.out.println(translateNum(12345));
        int[][] arr = {{1,3,1},//5
                       {1,5,1},
                       {4,2,1}};
    }                  //6

    public static int maxValue(int[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
       for (int i = 1;i<row;i++){
           grid[i][0]+=grid[i-1][0];
       }
       for (int j=1;j<col;j++){
           grid[0][j]+=grid[0][j+1];
       }
       for (int i=1;i<row;i++){
           for (int j = 1;j<col;j++){
               grid[i][j]+= Math.max(grid[i-1][j],grid[i][j-1]);
           }
       }
        return grid[row-1][col-1];
    }
}
