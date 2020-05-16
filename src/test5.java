import java.util.Scanner;

public class test5
{
    public static int[] calculate(int n,int m)
    {
        int res=0;
        for(int i=9;i>=1;i--)
        {
            for(int j=9;j>=0;j--)
            {
                int tmp=m*10+j+i*10000;
                if(tmp%n==0&&tmp/n>=1)
                {
                    return new int[]{i,j,tmp/n};
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        int n=Integer.parseInt(a);
        String[] strs=b.split(" ");
        int m=0;
        for(int i=0;i<3;i++)
        {
            m=m*10+Integer.parseInt(strs[i]);
        }
        int[] res=test5.calculate(n, m);
        for(int num:res)
            System.out.print(num+" ");
    }
}
