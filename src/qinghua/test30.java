package qinghua;

public class test30
{
    private static boolean judge(int m)
    {
        if(m*9>=10000) return false;
        int newNum=0;
        int n=m;
        while(n>0)
        {
            int tmp=n%10;
            newNum=newNum*10+tmp;
            n/=10;
        }
        return newNum==m*9;
    }

    public static void main(String[] args)
    {
        for(int i=1000;i<=9999;i++)
        {
            if(judge(i)) System.out.println(i);
        }
    }
}
