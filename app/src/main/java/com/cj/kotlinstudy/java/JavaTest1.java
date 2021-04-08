package com.cj.kotlinstudy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JavaTest1 {

    interface MObject{
        String play();
    }

    interface MObject1{
        void play1();
    }

    static class MyInstance implements MObject{

        @Override
        public String play() {
            System.out.println("llllll");
            return "";
        }
    }



    class MyProxy implements MObject{
         private MyInstance instance;
         public MyProxy(MyInstance instance){
             this.instance = instance;
         }
        @Override
        public String play() {
            instance.play();
            return "hahhaha";
        }
    }

    public static void test(){
        Object o = Proxy.newProxyInstance(MyInstance.class.getClassLoader(), MyInstance.class.getInterfaces(), new MyInvocationHandler(new MyInstance()));
        MObject mObject = (MObject) o;
        String play = mObject.play();
        System.out.println("test--play:"+play);
    }

    static class MyInvocationHandler implements InvocationHandler{

        private MyInstance instance;
        public MyInvocationHandler(MyInstance instance){
            this.instance = instance;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoke--"+method.getName());
            method.invoke(instance,args);
            return "你好";
        }
    }

    public static void main(String[] args){
          // test();
//        A a = new A();
//        Type[] types = a.getClass().getGenericInterfaces();
//        for (Type type : types) {
//            System.out.println(type instanceof ParameterizedType);
//            System.out.println(type.toString());
//            System.out.println(B.class.getName());
//            System.out.println(type.toString().contains(B.class.getName()));
//            //System.out.println(type);//结果是:B<C>
//            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
//            System.out.println(actualTypeArguments[0]);
//        }
        D a = new D();
        Type type = a.getClass().getGenericSuperclass();
        System.out.println(type);//结果是:E<F>
        //将type强转成Parameterized
//        ParameterizedType pt = (ParameterizedType )type;
//        Type [] actualTypes = pt.getActualTypeArguments();
//        System.out.println(actualTypes[0]);//结果:C
       // System.out.println(type);//结果是:E<F>

//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add("1");
//
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        list1.add(1);
       // list1.add("1");
    }

}
