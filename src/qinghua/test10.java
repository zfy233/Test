package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=bufferedReader.readLine())!=null)
        {
            String[] strings=s.split(" ");
            int x0=Integer.parseInt(strings[0]);
            int y0=Integer.parseInt(strings[1]);
            int z0=Integer.parseInt(strings[2]);
            int x1=Integer.parseInt(strings[3]);
            int y1=Integer.parseInt(strings[4]);
            int z1=Integer.parseInt(strings[5]);

            double m=Math.sqrt((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1)+(z0-z1)*(z0-z1));
            double n=Math.pow(m, 3)*4/3*Math.acos(-1);
            System.out.printf("%.3f %.3f",m,n);
        }
        bufferedReader.close();
    }
}
