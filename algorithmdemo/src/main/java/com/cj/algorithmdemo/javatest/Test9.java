package com.cj.algorithmdemo.javatest;

public class Test9 {
    /**
     地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
     它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
     例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
     示例 1：

     输入：m = 2, n = 3, k = 1
     输出：3
     示例 2：

     输入：m = 3, n = 1, k = 0
     输出：1
     1 <= n,m <= 100
     0 <= k <= 20
     */
    static int m, n, k;
    public static void main(String[] args){//18

        System.out.println(movingCount(2,3,1));
        System.out.println(movingCount1(2,3,1));
    }
    static boolean[][] visited;
    public static int movingCount(int m1, int n1, int k1) {
        m = m1; n = n1; k = k1;
        visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }
    public static int movingCount1(int m1, int n1, int k1) {
        m = m1; n = n1; k = k1;
        visited = new boolean[m][n];
        return dfs1(0, 0, 0);
    }

    /**
     *
     * @param i
     * @param j
     * @param si 数位和
     * @param sj
     * @return
     */
    public static int dfs(int i, int j, int si, int sj) {
        if(i >= m || j >= n || k < si + sj || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj)
                + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }

    /**
     *
     * @param i
     * @param j
     * @param si 数位和
     * @return
     */
    public static int dfs1(int i, int j, int si) {
        if(i >= m || j >= n || k < si  || visited[i][j]) return 0;
        visited[i][j] = true;
        int right = i/10+i%10+(j+1)/10+(j+1)%10;//右边下一个的数位和
        int down = (i+1)/10+(i+1)%10+j/10+j%10;//下边下一个的数位和
        return 1 + dfs1(i + 1, j, down)
                + dfs1(i, j + 1, right);
    }
}
