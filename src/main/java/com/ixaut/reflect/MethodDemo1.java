package com.ixaut.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
        /*
         *  要获取print(int,int)方法
         *  首先获取类的信息，获取类的信息首先要获取类的类类型
         *  其次获取方法，得到名称和参数列表
         *  getMethod获取public的方法
         *  getDeclaredMethod获取自己声明的方法
         */
        A a1 = new A();
        Class c = a1.getClass();
        try {
            //Method m = c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print",int.class,int.class);

            //方法的反射操作
            //a1.print(10,20);方法的反射操作是用m对象来进行调用
            //方法如果没有返回值返回null，如果有就返回具体的值
            try {
                Object o = m.invoke(a1,10,20);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("================");

        //获取print(String,String)
        try {
            Method m1 = c.getMethod("print",String.class,String.class);
            //a1.print("hello","world");
            Object o = m1.invoke(a1,"hello","world");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public void print(int a,int b){
        System.out.println(a + b);
    }

    public void print(String a,String b){
        System.out.println(a.toUpperCase()+","+b.toUpperCase());
    }
}