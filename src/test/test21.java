package test;

import java.util.Scanner;

public class test21
{
    public boolean isLeapYear(int y)
    {
        return ((y%400==0)||(y%4==0&&y%100!=0));
    }

    public int getDay(int year,int month,int day)
    {
        int[][] map=new int[][]{{31,28,31,30,31,30,31,31,30,31,30,31},
                {31,29,31,30,31,30,31,31,30,31,30,31}};

        int res=0;
        for(int i=1;i<year;i++)
        {
            if(isLeapYear(i)) res+=366;
            else res+=365;
        }

        for(int i=1;i<month;i++)
        {
            if(isLeapYear(year)) res+=map[1][i-1];
            else res+=map[0][i-1];
        }
        res+=day;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        int year1=Integer.parseInt(s1.substring(0, 4));
        int month1=Integer.parseInt(s1.substring(4, 6));
        int day1=Integer.parseInt(s1.substring(6, 8));
        int year2=Integer.parseInt(s2.substring(0, 4));
        int month2=Integer.parseInt(s2.substring(4, 6));
        int day2=Integer.parseInt(s2.substring(6, 8));
        test21 test21=new test21();
        int a=test21.getDay(year1, month1, day1);
        int b=test21.getDay(year2, month2, day2);
        System.out.println(Math.abs(a-b)+1);
    }
}
