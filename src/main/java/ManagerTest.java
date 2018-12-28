import java.util.ArrayList;

/**
 * 继承
 * 用超类引用直接引用子类
 * 一个对象可以指示多种实际类型的现象被称为多态，在运行时能够自动选择调用哪个
 * 方法的想成成为动态绑定
 * Java不需要将方法声明为虚方法，动态绑定是默认的处理方式。
 * */

public class ManagerTest
{
    public static void main(String[] srgs)
    {
        /*Manger boss = new Manger("Zhao Ruiqi",80000,
                2018,7,1);
        boss.setBonus(5000);

        hireling[] staff = new hireling[3];
        staff[0]=boss;
        staff[1]=new hireling("Harry",50000,
                2018,9,1);
        staff[2]=new hireling("Tommy",40000,
                2018,10,1);*/

        //ArrayList 使用
        ArrayList<hireling> staff = new ArrayList<>();

        staff.add(new hireling("Zharo Ruiqi",75000
                ,1992,7,1));
        staff.add(new hireling("Harry",50000
                ,1993,8,1));
        staff.add(new hireling("Tony",40000
                ,1994,9,1));

        for(hireling e:staff)
        {
            System.out.println("name="+e.getName()+",salary="
            +e.getSalary());
        }
    }
}
