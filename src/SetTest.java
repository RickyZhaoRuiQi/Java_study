import java.util.*;

/**
 * 2018-10-30
 * 使用集合从输入中存储不同的单词
 *
 * */

public class SetTest
{
    public static void main(String[] args)
    {
        Set<String> words = new HashSet<>();
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
        +totalTime+" milliseconds.");
    }
}
