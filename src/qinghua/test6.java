package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class test6
{
    public static void main(String[] args) throws IOException
    {
        Map<Character,int[]> map = new HashMap<>();
        map.put('a', new int[]{2,1});
        map.put('b', new int[]{2,2});
        map.put('c', new int[]{2,3});
        map.put('d', new int[]{3,1});
        map.put('e', new int[]{3,2});
        map.put('f', new int[]{3,3});
        map.put('g', new int[]{4,1});
        map.put('h', new int[]{4,2});
        map.put('i', new int[]{4,3});
        map.put('j', new int[]{5,1});
        map.put('k', new int[]{5,2});
        map.put('l', new int[]{5,3});
        map.put('m', new int[]{6,1});
        map.put('n', new int[]{6,2});
        map.put('o', new int[]{6,3});
        map.put('p', new int[]{7,1});
        map.put('q', new int[]{7,2});
        map.put('r', new int[]{7,3});
        map.put('s', new int[]{7,4});
        map.put('t', new int[]{8,1});
        map.put('u', new int[]{8,2});
        map.put('v', new int[]{8,3});
        map.put('w', new int[]{9,1});
        map.put('x', new int[]{9,2});
        map.put('y', new int[]{9,3});
        map.put('z', new int[]{9,4});

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while((s=br.readLine())!=null)
        {
            int res=0;
            int n=s.length();
            for(int i=0;i<n-1;i++)
            {
                char tmp1=s.charAt(i);
                char tmp2=s.charAt(i+1);
                if(map.get(tmp1)[0]!=map.get(tmp2)[0]) res+=map.get(tmp1)[1];
                else res=res+map.get(tmp1)[1]+2;
            }
            res+=map.get(s.charAt(n-1))[1];
            System.out.println(res);
        }
        br.close();
    }
}
