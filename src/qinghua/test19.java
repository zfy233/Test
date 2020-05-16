package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test19
{
    int[][] months=new int[][]{{31,28,31,30,31,30,31,31,30,31,30,31},
                                {31,29,31,30,31,30,31,31,30,31,30,31}};

    private boolean isYear(int year)
    {
        return (year%400==0||(year%4==0&&year%100!=0));
    }

    private int getDay(int year,int month,int day)
    {
        int res=0;
        int flag=0;
        if(isYear(year)) flag=1;
        for(int i=1;i<month;i++)
        {
            res+=months[flag][i-1];
        }
        res+=day;
        return res;
    }


    public static void main(String[] args) throws IOException
    {
        test19 test19=new test19();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            String[] strings=s.split(" ");
            int year=Integer.parseInt(strings[0]);
            int month=Integer.parseInt(strings[1]);
            int day=Integer.parseInt(strings[2]);
            int res=test19.getDay(year, month, day);
            System.out.println(res);
        }
    }
}
