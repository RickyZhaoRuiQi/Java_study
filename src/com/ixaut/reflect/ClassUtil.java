package com.ixaut.reflect;

import java.lang.reflect.Method;

public class ClassUtil {
    /**
     * 打印类的信息，包括类的成员函数、成员变量
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
}
