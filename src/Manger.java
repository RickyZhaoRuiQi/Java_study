
/**
 * 继承
 * 本文件为子类，经理
 * 经理继承自雇员（hiring）类
 * 经历比雇员多出奖金实例域
 * 同时多出设置奖金的方法
 * super可用于初始化超类和调用超类中的方法，因为子类无法直接访问超类中的实例域
 *
 * */

public class Manger extends hireling
{
    private double bonus;

    public Manger(String name,double salary,int year
    ,int month,int day)
    {
        super(name,salary,year,month,day);
        bonus=0;
    }

    public double getSalary()
    {
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double b)
    {
        bonus=b;
    }
}
