package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test18
{
    static int[][] months=new int[][]{{31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31}};

    private static boolean isYear(int m)
    {
        return (m%4==0&&m%100!=0)||(m%400==0);
    }

    public static void main(String[] args)
    {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("January", 1);
        map1.put("February", 2);
        map1.put("March", 3);
        map1.put("April", 4);
        map1.put("May", 5);
        map1.put("June", 6);
        map1.put("July", 7);
        map1.put("August", 8);
        map1.put("September", 9);
        map1.put("October", 10);
        map1.put("November", 11);
        map1.put("December", 12);

        Map<Integer,String> map2=new HashMap<>();
        map2.put(1, "Monday");
        map2.put(2, "Tuesday");
        map2.put(3, "Wednesday");
        map2.put(4, "Thursday");
        map2.put(5, "Friday");
        map2.put(6, "Saturday");
        map2.put(0, "Sunday");

        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        int day=Integer.parseInt(strings[0]);
        int month=map1.get(strings[1]);
        int year=Integer.parseInt(strings[2]);

        int res=0;
        for(int i=1;i<year;i++)
        {
            if(test18.isYear(i)) res+=366;
            else res+=365;
        }

        for(int i=1;i<month;i++)
        {
            if(test18.isYear(year))
            {
                res+=months[1][i-1];
            }
            else res+=months[0][i-1];
        }
        res+=day;
        System.out.println(map2.get(res%7));
    }
}
