import java.util.*;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;


class aa
{
    public static int calculate(String s)
    {
        int num=0;
        char sign='+';
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                num=10*num+(int)(c-'0');
            }
            else if(c=='(')
            {
                for(int j=s.length()-1;j>i;j--)
                {
                    char tmp=s.charAt(j);
                    if(tmp==')')
                    {
                        num=calculate(s.substring(i+1,j));
                        i=j+1;
                    }
                }
            }
            if(!Character.isDigit(c)||i==s.length()-1)
            {
                if(sign=='+')  stack.push(num);
                else if(sign=='-') stack.push(-num);
                else if(sign=='*')
                {
                    int pre=stack.pop();
                    stack.push(pre*num);
                }
                else if(sign=='/')
                {
                    int pre=stack.pop();
                    stack.push(pre/num);
                }
                sign = c;
                num=0;
            }
        }
        int res=0;
        for(int m:stack) res+=m;
        return res;
    }

    public static void main(String[] args) {
        String s="6/2+（3+3）*4";
        System.out.println(aa.calculate(s));
    }
}





