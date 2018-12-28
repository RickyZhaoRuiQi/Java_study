import java.util.*;

import static java.util.Arrays.asList;

/**
 * 2018-10-30
 * 集合框架
 * Collection：元素集合
 * Map：键值对
 * */

public class SetTest
{
    public static void main(String[] args)
    {
        /*Set<String> words = new HashSet<>();
        long totalTime = 0;

        try (Scanner in = new Scanner(System.in))
        {
            while (in.hasNext())
            {
                String word = in.next();
                if(word.equals("exit"))
                {
                    in.close();
                    break;
                }
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> it = words.iterator();
        for(int i = 1;i <= 20 && it.hasNext();++i)
            System.out.println(it.next());
        System.out.println("...");
        System.out.println(words.size()+" distinct words."
        +totalTime+" milliseconds.");*/

        /*String[] num = {"one","two","three","four","five",
                "six","seven","eight","nine","ten"};
        Vector<String> vec = new Vector<String>(asList(num));
        System.out.println("Before Vector:"+vec);
        Iterator<String> nums = vec.iterator();
        while(nums.hasNext())
        {
            String str = nums.next();
            System.out.println(str);
            if(str.length()>4)
                nums.remove();
        }
        System.out.println("After Vector:"+vec);*/
    }
}
