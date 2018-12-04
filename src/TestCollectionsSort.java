import java.util.*;

public class TestCollectionsSort
{
    private void testSort1()
    {
        Random ran = new Random();
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0;i < 10;++i)
        {
            li.add(ran.nextInt(100));
        }
        for(Integer tmp : li)
        {
            System.out.printf("%d ",tmp);
        }

        //Collections.reverseOrder()得到Comparable中方法的逆序
        //Collections.sort(li,Collections.reverseOrder());
        Collections.sort(li,new Comp());


        System.out.println();
        for(Integer tmp : li)
        {
            System.out.printf("%d ",tmp);
        }
    }

    public static void main(String[] args)
    {
        TestCollectionsSort tmp = new TestCollectionsSort();
        tmp.testSort1();
    }
}


//测试Comparator
class Comp implements Comparator<Integer>
{
    public int compare(Integer t1,Integer t2)
    {
        return -(t1-t2);
    }
}
