package Effective_Java;

import com.google.common.collect.Maps;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class test {

    public static void main(String[] args){

        Map<PhoneNumber,String> m = new HashMap<>();
        PhoneNumber pn = new PhoneNumber(1,1,2);
        m.put(pn,"Ricky");
        System.out.println(pn.hashCode());
        System.out.println(m.get(new PhoneNumber(1,1,2)));

        /*ColorPoint cp = new ColorPoint(1,2,Color.blue);
        Point p = new Point(1,2);

        System.out.println(cp instanceof Object);
        System.out.println(cp instanceof Point);
        System.out.println(cp instanceof ColorPoint);

        System.out.println(p instanceof ColorPoint);
        System.out.println(null instanceof Object);*/

        /*long t1 = System.currentTimeMillis();
        Long sum1 = 0L;//自动装箱
        for(int i = 0;i < Integer.MAX_VALUE;++i){
            sum1 += i;
        }
        long t2 = System.currentTimeMillis();
        long sum2 = 0L;
        for(int i = 0;i < Integer.MAX_VALUE;++i){
            sum2 += i;
        }
        long t3 = System.currentTimeMillis();

        System.out.println(sum1);
        System.out.printf("时间：%f\n", + (double)(t2-t1) / 1000);
        System.out.println(sum2);
        System.out.printf("时间：%f\n", + (double)(t3-t2) / 1000);*/

        /*Boolean bo = new Boolean("true");
        Boolean bo1 = Boolean.valueOf("true");

        System.out.println(bo.hashCode());
        System.out.println(bo1.hashCode());*/

        /*String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("--------------");

        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());*/

    }
}

final class PhoneNumber{
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode,int prefix,
                        int lineNumber){
        rangeCheck(areaCode,999,"areaCode");
        rangeCheck(prefix,999,"prefix");
        rangeCheck(lineNumber,9999,"lineNumber");
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    private static void rangeCheck(int arg,int max,String name){
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name+": "+arg);
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;
        if(!(o instanceof PhoneNumber))
            return false;

        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(areaCode,prefix,lineNumber);
    }*/
}

class Point{
    private final int x;
    private final int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        //性能优化,如果比较操作有可能很昂贵,就值得这么做

        if(!(o instanceof Point))
            return false;
        Point p = (Point)o;
        return p.x == x && p.y == y;
    }
}

class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x,int y,Color color){
        super(x,y);
        this.color = color;
    }
}
