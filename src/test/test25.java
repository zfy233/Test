package test;

import java.util.Arrays;
import java.util.Scanner;

public class test25
{
    public String[] stringSort(String s)
    {
        String[] strs=new String[s.length()];
        for(int i=s.length()-1;i>=0;i--)
        {
            strs[i]=s.substring(i, s.length());
        }
        Arrays.sort(strs);
        return strs;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        test25 test25=new test25();
        String[] strs=test25.stringSort(s);
        for(String string:strs)
            System.out.println(string);
    }
}
