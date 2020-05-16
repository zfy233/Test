package test;

import java.util.Scanner;

public class test20
{
    static int[] prinmNum=new int[10000];
    static boolean[] num=new boolean[150000];

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=Integer.parseInt(scanner.nextLine());
        int count=0;
        for(int i=2;i<num.length;i++)
        {
            if(!num[i])
            {
                prinmNum[count++]=i;
                if(count==10000) break;
                for(int j=i;j<num.length;j+=i) num[j]=true;
            }
        }
        System.out.println(prinmNum[k-1]);
    }
}
