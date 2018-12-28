package com.ixaut.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
    /**
     * 打印类的信息，类的成员函数
     * @param obj 该对象所属类的信息
     * */
    public static void printClassMessage(Object obj){
        //要获取类的信息，首先要获取类的类类型
        Class c = obj.getClass();//传递是哪个子类的对象 c就是该子类的类类型
        //获取类的名称
        System.out.println("类的名称是："+c.getName());
        /**
         * 一个方法就是一个Method对象
         * getMethods()方法获取所有public的函数，包括父类继承而来的
         * getDeclaredMethods()获取的是所有该类自己声明的方法，不问访问权限
         */
        Method[] ms = c.getMethods();//c.getDeclaredMethods()
        for(Method m:ms)
        {
            //得到方法的返回值类型的类类型
            Class returnType = m.getReturnType();
            System.out.print(returnType.getName()+" ");
            //得到方法的名称
            System.out.print(m.getName()+"(");
            //获取参数类型--->参数列表的类型的类类型
            Class[] paramType = m.getParameterTypes();
            for(Class cl:paramType)
            {
                System.out.print(cl.getName()+",");
            }
            System.out.println(")");
        }
    }

    public static void printFieldMessage(Object obj) {

        /**
         * 打印类的信息，成员变量
         * @param obj 该对象所属类的信息
         * */

        /*
         * 成员变量也是i对象
         * java.lang.reflect.Field
         * Field类封装了关于成员变量的操作
         * getField()方法获取的是所有的public的成员变量信息
         * getDeclaredFields()获取该类自己声明的成员变量信息
         *
         * */

        Class c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for(Field f:fs)
        {
            //得到成员变量的类型的类类型
            Class fieldType = f.getType();
            String typeName = fieldType.getName();
            //得到成员变量的名称
            String fieldName = f.getName();
            System.out.println(typeName+" "+fieldName);
        }
    }

    public static void printConMessage(Object obj){
        /**
         * 打印对象的构造函数的信息
         * @param obj 该对象所属类的信息
         *
         *  构造函数也是对象
         *  java.lang.Constructor中封装了构造函数的信息
         *  getConstructor()过去所有public构造函数
         *  getDeclaredConstructors()得到所有的构造函数
         * */
        Class c = obj.getClass();
        //Constructor[] cs = c.getConstructor();
        Constructor[] cs = c.getDeclaredConstructors();
        for(Constructor con:cs)
        {
            System.out.print(con.getName()+"(");
            //获取构造函数的参数列表-->得到参数列表的类类型
            Class[] paramTypes = con.getParameterTypes();
            for(Class cl:paramTypes)
            {
                System.out.print(cl.getName()+",");
            }
            System.out.println(")");
        }
    }
}
