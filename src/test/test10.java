package test;

import java.util.Arrays;
import java.util.Scanner;

public class test10
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int m=Integer.parseInt(scanner.nextLine());
        String[] strings=new String[m];
        for(int i=0;i<m;i++)
        {
            strings[i]=scanner.nextLine();
        }
        Arrays.sort(strings);

        String[] strings1 = strings[0].split("\\\\");
        for(int i=0;i<strings1.length;i++)
        {
            StringBuilder tmp=new StringBuilder();
            for(int j=0;j<i;j++) tmp.append(" ");
            tmp.append(strings1[i]);
            System.out.println(tmp);
        }

        for(int i=1;i<m;i++)
        {
            int mark=0;
            String[] strings2=strings[i].split("\\\\");
            for(int j=0;j<strings2.length;j++)
            {
                if(j<strings1.length&&strings1[j].equals(strings2[j])&&mark==0) continue;
                mark=1;
                StringBuilder tmp=new StringBuilder();
                for(int k=0;k<j;k++) tmp.append(" ");
                tmp.append(strings2[j]);
                System.out.println(tmp);
            }
            strings1 = Arrays.copyOf(strings2, strings2.length);
        }
    }
}
