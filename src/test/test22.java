package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class test22
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            String[] strings1=s.split(" ");
            int m=Integer.parseInt(strings1[0]);
            int n=Integer.parseInt(strings1[1]);
            int[] numA=new int[m];
            int[] numB=new int[n];
            String[] strings2=br.readLine().split(" ");
            for(int i=0;i<m;i++)
            {
                numA[i]=Integer.parseInt(strings2[i]);
            }
            String[] strings3=br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                numB[i]=Integer.parseInt(strings3[i]);
            }
            String[] strings4=br.readLine().split(" ");
            int start1=Integer.parseInt(strings4[0]);
            int end1=Integer.parseInt(strings4[1]);
            int start2=Integer.parseInt(strings4[2]);
            int end2=Integer.parseInt(strings4[3]);
            int count=end1+end2-start1-start2+2;
            int[] res=new int[count];
            int tmp=0;
            for(int i=start1;i<=end1;i++)
            {
                res[tmp++]=numA[i-1];
            }
            for(int i=start2;i<=end2;i++)
            {
                res[tmp++]=numB[i-1];
            }
            System.out.println(res[(count-1)/2]);
        }
        br.close();
    }
}
