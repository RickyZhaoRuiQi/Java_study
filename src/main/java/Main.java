import java.io.Console;
import java.io.*;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*隐藏和覆盖测试*/
        /*hideAndCover test = new hideAndCover();
        test.printb();
        test.setx(7);
        test.printa();
        test.printb();*/

        /*相等和判同一*/
        /*String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.getClass().getName());*/

        /*int[][] odds = new int[5][];
        for(int i=0;i < 5;++i)
            odds[i] = new int[i];
        int num = 0;
        for(int n=0;n<odds.length;++n)
        {
            for(int k=0;k<odds[n].length;++k)
                odds[n][k] = ++num;
        }

        for(int[] row:odds)
        {
            for(int tmp:row)
                System.out.printf("%03d ",tmp);
            System.out.println();
        }*/

        //LocalDate使用事例
        /*LocalDate date = LocalDate.now();
        int month = date.getMonthValue();  //得到当前月份
        int today = date.getDayOfMonth();  //得到当前日

        date = date.minusDays(today-1);    //得到月初时间，minusDay(arg),从当前日期间去args得到时间
        DayOfWeek weekday = date.getDayOfWeek(); //得到月初是星期几
        int value = weekday.getValue();    //得到具体的数字

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i < value;++i)
            System.out.print("    ");

        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1)
            System.out.println();*/

        /*NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));*/


    }
}