import java.io.*;



public class FileCopy
{
        public static void main(String[] args)
        {
            if(args.length == 2)
            {
                new CopyMaker().copy(args[0],args[1]);
            }
            else
            {
                System.out.println("args error");
            }
        }
}

class CopyMaker
{
    String srcName,dstName;
    BufferedReader source;
    BufferedWriter dest;
    String line;

    private boolean openFile()
    {
        try
        {
            source = new BufferedReader(new FileReader(srcName));
        }
        catch(IOException iox)
        {
            System.out.println("Problem opening " + srcName);
            return false;
        }
        try
        {
            dest = new BufferedWriter(new FileWriter(dstName));
        }
        catch(IOException iox)
        {
            System.out.println("Problem opening " + dstName);
            return false;
        }
        return true;
    }
    private boolean copyFile()
    {
        try
        {
            line = source.readLine();
            while(line != null)
            {
                dest.write(line);
                dest.newLine();
                line = source.readLine();
            }
        }
        catch(IOException iox)
        {
            System.out.println("Problem reading or writing");
            return false;
        }
        return true;
    }
    private boolean closeFile()
    {
        boolean retVal = true;
        try
        {
            source.close();
        }
        catch(IOException iox)
        {
            System.out.println("Problem closing "+ srcName);
            retVal = false;
        }
        try
        {
            dest.close();
        }
        catch(IOException iox)
        {
            System.out.println("Problem closing "+dstName);
            retVal = false;
        }
        return retVal;
    }
    public boolean copy(String src,String dst)
    {
        srcName = src;
        dstName = dst;
        return openFile() && copyFile() && closeFile();
    }
}
