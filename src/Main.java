import java.awt.*;
import java.util.Arrays;

/*
 *      Java学习代码 赵睿琦
 */

class Book
{
    public int id;
    public Book(int id)
    {
        this.id = id;
    }

    protected void finalize()
    {
        switch(id)
        {
            case 1:
                System.out.println("《飘》");
                break;
            case 2:
                System.out.println("《Java语言程序设计》");
                break;
            case 3:
                System.out.println("《罗马假日》");
                break;
            default:
                System.out.println("《未知书籍》");
                break;
        }
        System.out.println("所对应的实例对象存储单元被回收");
    }
}

public class Main
{
    static public int test(int arr[])
    {
        int a[] = arr;
        int sum = 0;
        for(int r:a)
        {
            sum+=r;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Book book = new Book(1);
        Book book1 = new Book(3);
        System.gc();
    }
}