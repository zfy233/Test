package qinghua;

public class test31
{
    private static boolean judge(int m)
    {
        int n=m;
        int newM=0;
        while(n>0)
        {
            int tmp=n%10;
            newM=newM*10+tmp;
            n/=10;
        }
        return m==newM;
    }

    public static void main(String[] args)
    {
        for(int i=0;i<=256;i++)
        {
            if(judge(i*i)) System.out.println(i);
        }
    }
}
