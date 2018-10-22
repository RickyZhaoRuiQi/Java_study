import java.time.LocalDate;

/**
 * 继承
 * 本文件为超类雇员
 * 超类提供名字，基本薪水，入职年月
 * 以及访问器
 *
 * */

public class hireling
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public hireling(String name,double salary,int year
    ,int month,int day)
    {
        this.name=name;
        this.salary=salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
