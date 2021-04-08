package com.cj.algorithmdemo.javatest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaObject {
    public static void main(String[] args){
      //  RepositoryManager.INSTANCE.method();
        new Test().test();
    }

    static class Test{
        private final List<String> listData = new ArrayList<>();
        public synchronized void addData(String data){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            listData.add(data);
        }
        public void printData(){
            synchronized (listData){
                System.out.println(Thread.currentThread().getName());
                System.out.println(listData);
            }
        }
        public void test(){
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for (int i = 0;i<4;i++){
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        addData("data");
                    }
                });
            }
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    printData();
                }
            });
        }
    }
}


