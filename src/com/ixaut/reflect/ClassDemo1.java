package com.ixaut.reflect;

import java.lang.reflect.InvocationTargetException;

public class ClassDemo1 {
    public static void main(String[] args) {
        //Foo的实例对象如何表示
        Foo foo1 = new Foo();
        //Foo这个类也是一个实例对象，Class类的实例对象，如何表示？

        //任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        //第一种表示方式-->实际是在告诉我们任何一个类都有一个隐含的静态成员变量
        Class c1 = Foo.class;

        //第二种表达方式 已直该类的对象通过getClass方法
        Class c2 = foo1.getClass();

        //c1,c2表示Foo类的类类型(class type)， Class->Foo->foo1,foo1的类类型为Foo

        //c1,c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        //第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("com.ixaut.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);

        //我们可以通过类的类类型创建该类的对象--->通过c1 or c2 or c3创建Foo的实例
        try {
            Foo foo2 = (Foo)c1.newInstance();    //java9中已过时
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //取代物
        try {
            Foo foo3 = (Foo)c1.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //与new出来的对象有个区别？
        //运用new创建实例对象类可以未加载，而调用newinstance时类必须完成加载和链接操作
        //运用new创建实例对象，实例对象所对应的类必须被导入或是我们自定义，而newinstance使用的是反射机制，可以在运行时再来检测类是否存在，并且newinstance只能调用public修饰的构造函数，new可以调用包中的非public构造函数，关于反射机制
    }
}

class Foo{

}
