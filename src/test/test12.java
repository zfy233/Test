package test;

import java.util.Scanner;
import java.util.Stack;

public class test12
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        Stack<Double> stack=new Stack<>();
        double num=0;
        char flag='+';
        for(int i=0;i<s.length();i++)
        {
            char tmp=s.charAt(i);
            if(Character.isDigit(tmp))
            {
                num=num*10+(tmp-'0');
            }
            if(!Character.isDigit(tmp)||i==s.length()-1)
            {
                if(flag=='+') stack.push(num);
                else if(flag=='-') stack.push(-num);
                else if(flag=='*') stack.push(stack.pop()*num);
                else if(flag=='/') stack.push(stack.pop()/num);
                flag=tmp;
                num=0;
            }
        }
        double res=0;
        for(double d:stack) res+=d;
        System.out.println((int)res);
    }
}

