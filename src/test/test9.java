package test;

import java.util.Scanner;

public class test9
{
    public boolean judge(int a)
    {
        int[] tmp=new int[]{1,1,2,6,24,120,720,5040,40320,362880};
        for(int i=9;i>=0;i--)
        {
            if(a-tmp[i]==0) return true;
            else if(a-tmp[i]<0) continue;
            else a-=tmp[i];
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int a=Integer.parseInt(s);
        test9 test9=new test9();
        if(test9.judge(a)) System.out.println("YES");
        else System.out.println("NO");
    }
}
