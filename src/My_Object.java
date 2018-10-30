/*
 *Object类
 * 1.所有类的直接或间接超类，处在类层次的最高点
 * 2.包含了所有Java类的公共属性
 *  1）public final Class getClass()获取当前对象所属类信息，返回Class对象
 *  2）public String toString()返回表示当前对象本身有关信息的字符串对象
 *  3）public boolean equals(Object obj)判断引用是否指向同一对象，判断同一
 *  4）protected Object clone()复制当前对象，并返回这个副本
 *  5）public int hashCode()返回该对象的哈希代码值
 *      (1)hashCode是一个返回对象散列码的方法，该方法实现的一般规定是
 *          <1>在一个Java程序的一次执行过程中，如果对象“相等比较”所使用的信息没有被修
 *          改的话，同一对象执行hashCode方法每次都应返回同一整型数。在不同的执行中，对
 *          象的hashCode方法返回值不必一直
 *          <2>如果依照equals方法两个对象相等的，则在这两个对象上调用hashCode方法应该
 *          返回同样的结果
 *          <3>如果依照equals方法两个对象不相等，并不要求在这两个对象上调用hashCode方
 *          法返回不同的值
 *       (2)只要实现得合理，Object类定义的hashCode方法为不同的对象返回不同的整数，一个
 *       典型d的实现是，将对象的内部地址转换为整数返回，但是Java并不要求这样做
 *  6）protected void finalize() throws Throwable 对象被回收时执行，通常完成
 *  资源释放工作
 *
 */

public class My_Object
{
    String s;

    public boolean equals(My_Object obj) //判断引用是否指向同一对象，判断同一
    {
        //return this == obj; 默认方法的实现

        //如果我们需要判断两个对象是否相等
        if(this.getClass() != obj.getClass())
            return false;
        Object b = (My_Object)obj;  //将b转成与当前类相同的类，才可以使用当前类的方法
        return this.s.equals(obj.s);
    }
}
