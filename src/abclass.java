/*
 * 抽象类
 * 1.类名前加abstract
 * 2.可包含常规类能包含的任何成员，包括非抽象方法
 * 3.也可包含抽象方法：用abstract修饰，只有方法原型，没有方法实现
 * 4.没有具体的实例对象的类，不能使用new方法进行实例化，只能作用超类
 * 5.只有当子类实现了抽象超类中的所有抽象方法，子类才不是抽象类，才能实例化
 * abstract class example
 * {...}
 *
 */

public abstract class abclass
{
    abstract void example();
}
