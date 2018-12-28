/*
* 类的构造
*
* 类的构造有三种途径：
* 1.在构造器中设置值（构造函数）；
* 2.在声明中赋值（域初始化语句）；
* 3.初始化块。
*
* 初始化顺序
* 1.所有数据域被初始化为默认值（0，false或null）
* 2.按照在类中声明中出现的次序，依次执行所有域初始化语句和初始化块
* 3.如果构造器第一行调用了第二个构造器，则执行第二个构造器主体
* 4.执行或者构造器的主体
*
* */

import java.util.Random;

public class ConstructorTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry",40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for(Employee e : staff)
        {
            System.out.println("name="+e.getName()+",id="
            +e.getId()+",salary="+e.getSalary());
        }
    }
}

class Employee
{
    private static int nextId;

    //可以在定义时赋初始值，域初始化语句
    private int id;
    private String name = "";
    private double salary;

    static//静态初始化块，对初始化静态域
    {
        Random generator = new Random();//构造一个随机数生成器
        nextId = generator.nextInt(10000);//得到一个0-10000随机数
    }

    {//初始化块，只要构造类的对象，初始化块就会被执行
        id = nextId;
        ++nextId;
    }

    //构造器
    public Employee(String n,double s)
    {
        name = n;
        salary = s;
    }

    public Employee(double s)
    {
        this("Employee #" + nextId,s);
    }

    public Employee()
    {

    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }
}
