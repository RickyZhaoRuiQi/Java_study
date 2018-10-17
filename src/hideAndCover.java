/*
 *1.隐藏：子类中声明了与超类中相同的成员变量名
 *  1）从超类继承的变量将被隐藏
 *  2）子类拥有了两个相同名字的变量，一个继承自超类，另一个是由自己声明
 *  3）当子类执行继承自超类的操作时，处理的是继承自超类的变量，而当子类执行它自己声明的方
 *  法时，所操作的就是它自己声明的变量
 *  4）super.属性名，访问继承自超类中的变量
 *
 *2.覆盖：如果子类不需要使用从超类继承而来的方法的功能，则可以声明自己的同名方法称为覆盖
 *  1）覆盖方法的返回类型，方法名称，参数的个数及类型必须和被覆盖的方法一模一样
 *  2）只需在方法名前面使用不同的类名或不同类的对象名即可区分覆盖方法和被覆盖方法
 *  3）覆盖方法的访问权限可以比被覆盖的宽松，但是不能更为严格
 *  4)tips:
 *      （1）必须覆盖的方法，子类必须覆盖超类中的抽象方法，否则子类也成为抽象类
 *      （2）不能覆盖的类，超类中修饰为final的方法，超类中的静态方法
 *      （3）调用被覆盖的方法，super.overriddenMethod();
 */

class base
{
    int number = 2;
    public void setx(int number)
    {
        this.number = number;
    }
    public void printa()
    {
        System.out.println(number);
    }
}

public class hideAndCover extends base
{
    int number = 100;//将隐藏超类的同名变量
    void printb()
    {
        super.number += 10;//子类中访问超类的同名变量
        System.out.println("Super.number = " + super.number + ",number = "
                + number);
    }
}
