package com.cj.algorithmdemo.javatest;

public class Test {
    //https://blog.csdn.net/qiaoer2017/article/details/82715028
    public static void main(String[] args){
      int[] arr = {0,1,2,3,4,5,6,7,8,9,10,13};
        binarySearch(arr,11);
      // 5 ->4
    }

    /**
     * 二分查找  sparseArray <Integer ,object>
     * arrayMap <key value>
     *     两个数组 分别存储keys  values
     *     keys排序好的 arrayMap是 keys的hashcode()值  通过二分查找
     * @return
     */
    private static int binarySearch(int[] aar,int value){
      int index = -1;
      int start = 0;
      int end  = aar.length;
      int mid = (start+end)/2;
      while(start<end){
          if(value == aar[mid]){
              index = mid;
              break;
          }else if(value > aar[mid]){
              start = mid+1;
          }else{
              end = mid;
          }
          mid = (start+end)/2;
          System.out.println("start:"+start);
          System.out.println("end:"+end);
          System.out.println("mid:"+mid);
      }
        System.out.println("start:"+start);
        System.out.println("end:"+end);
       System.out.println("index:"+index);
      return index;
    }
}
