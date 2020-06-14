package com.cj.algorithmdemo.javatest;


public class Test20 {
    /**
     数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。

     请写一个函数，求任意第n位对应的数字。

      

     示例 1：

     输入：n = 3
     输出：3
     示例 2：

     输入：n = 11
     输出：0
     */
    public static void main(String[] args){
       // System.out.println("最大和："+ maxSubArray(arr));
        System.out.println("value："+ findNthDigit(198));
    }
    public static int findNthDigit(int index) {
        if (index < 0) return -1;
        return getResult(index);
    }
    private static int getResult(int index){
        long cur = 0; //表示当前位数总数目 例如 1位数(0~9)共占用10个位置  2位数(10~99)共占用2*90个位置 3位数(100~999)共占用3*900个位置
        int digits = 1; // 表示位数 0~9表示1位数  10-99 是两位数 100-990 是三位数
        System.out.println("要找的下标："+index);
        while (true) {
            System.out.println("digits："+digits);
            if (digits == 1)  //根据是几位数 可以确定共占用多少个位置
                cur = 10; //1位数的比较特殊
            else
                cur = (long)Math.pow(10,digits-1)*9*(digits); // 此处用long避免溢出
                //比如2位数  就是 (10^2-1)*9*2 = 180;\
            System.out.println("bb   cur："+cur+"  index:"+index);
            if(index > cur){ // 传入的是下标  判断下标在不在当前位数中  比如是在 0~9  10~99中
                index -= cur;//如果大于当前位数所占用的所有位置  则表示不属于该位数 减去当前所有位置
                digits++;
                System.out.println("index："+index);
            }else {
                System.out.println("cc  digits："+digits);
                System.out.println("cc  index："+index);
                long start = (digits == 1)?0:(int)Math.pow(10,digits-1);
                System.out.println("cc  start："+start);
                long a = index / (digits);
                int b = index % (digits);
                System.out.println("cc  a："+a);
                System.out.println("cc  b："+b);
                System.out.println("cc  s:"+Long.toString(a+start));
                return Long.toString(a+start).charAt(b) - '0';
                //  return Long.toString(num).charAt((n - 1) % digit) - '0'; /
            }
        }
    }

}
