package com.ixaut.reflect;

public class ClassDemo2
{
    public static void main(String[] args) {

        Class c1 = int.class;       //int数据类型的类类型
        Class c2 = String.class;    //String的类类型
        Class c3 = double.class;    //double的类类型
        Class C4 = Double.class;    //Double的类类型
        Class c5 = void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());//不包含包名的类名称
        System.out.println(c5.getName());
    }
}
