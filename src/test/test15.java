package test;

import java.util.Scanner;

public class test15
{
    static int[] numN=new int[1001];
    static int[] numA=new int[1001];
    static int[] primNum=new int[1001];

    private void getnumN(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int tmp=i;
            for(int j=2;j<=1000;j++)
            {
                if(tmp==0) break;
                while(tmp!=0&&tmp%j==0)
                {
                    tmp/=j;
                    numN[j]++;
                }
            }
        }
    }

    private void getnumA(int a)
    {
        for(int j=2;j<=1000;j++)
        {
            if(a==0) return;
            while(a!=0&&a%j==0)
            {
                a/=j;
                numA[j]++;
            }
        }
    }

    private void getPrim()
    {
        int count=1;
        boolean[] visited=new boolean[15000];
        for(int i=2;i<15000;i++)
        {
            if(!visited[i])
            {
                primNum[count++]=i;
                if(count==1001) return;
                for(int j=i;j<15000;j+=i) visited[i]=true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        int n=Integer.parseInt(strings[0]);
        int a=Integer.parseInt(strings[1]);
        test15 test15=new test15();
        test15.getPrim();
        test15.getnumA(a);
        test15.getnumN(n);

        int res=Integer.MAX_VALUE;
        for(int i=1;i<=1000;i++)
        {
            if(numA[i]!=0) res=Math.min(res, numN[i]/numA[i]);
        }
        System.out.println(res);
    }
}
