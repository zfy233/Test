import java.util.Scanner;

public class test2
{
    public int Judge(int a,int b)
    {
        int sum1=Reverse(a+b);
        int sum2=Reverse(a)+Reverse(b);
        if(sum1==sum2) return sum1;
        else return 0;
    }

    public int Reverse(int n)
    {   
        int res=0;
        while(n>0)
        {
            int tmp=n%10;
            res=res*10+tmp;
            n/=10;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        test2 test=new test2();
        int res=test.Judge(a,b);
        if(res==0)
            System.out.println("NO");
        else System.out.println(res);
    }
}
