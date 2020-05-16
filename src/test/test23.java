package test;

import java.util.Scanner;

public class test23
{
    public int[] sum(String s)
    {
        int[] map=new int[26];
        for(char c:s.toCharArray())
        {
            if(c>='A'&&c<='Z')
                map[c-'A']++;
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        test23 test23=new test23();
        int[] map=test23.sum(s);
        for(int i=0;i<26;i++)
        {
            char c=(char)(i+'A');
            System.out.println(c+":"+map[i]);
        }
    }
}
