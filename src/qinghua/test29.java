package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class test29
{
//    private static long mToten(int m,String s)
//    {
//        long res=0;
//        int bit=1;
//        for(int i=s.length()-1;i>=0;i--)
//        {
//            char tmp=s.charAt(i);
//            if(tmp>='0'&&tmp<='9') res+=bit*(tmp-'0');
//            else if(tmp>='A'&&tmp<='Z') res+=bit*(tmp-'A'+10);
//            bit*=m;
//        }
//        return res;
//    }
//
//    private static String tenTon(int n,long num)
//    {
//        StringBuilder res=new StringBuilder();
//        while(num>0)
//        {
//            long tmp=num%n;
//            if(tmp>=0&&tmp<=9) res.append(tmp);
//            else if(tmp>=10) res.append((char)(tmp-10+'a'));
//            num/=n;
//        }
//        return res.reverse().toString();
//    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            String[] strings=s.split(" ");
            int m=Integer.parseInt(strings[0]);
            int n=Integer.parseInt(strings[1]);
            String tmp=br.readLine();
            BigInteger num=new BigInteger(tmp,m);
            String res=num.toString(n);
            System.out.println(res);
        }
        br.close();
    }
}
