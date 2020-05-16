package test;

import java.util.Scanner;

public class test30
{
    private static int getCost(int[][] cost,int m,int[][] minCost)
    {
        int n=cost.length;
        for(int i=m+1;i<=n-1;i++)
        {
            minCost[m][i]=cost[m][i];
            for(int j=m+1;j<=n-1;j++)
            {
                minCost[m][i]=Math.min(minCost[m][i], minCost[m][j]+cost[j][i]);
            }
        }

        for(int i=m+1;i<=n-1;i++)
        {
            for(int j=i;j<=m-1;j++)
            {
                minCost[i][j]=Math.min(minCost[i][j], minCost[m][i]+cost[i][j]);
            }
        }

        int res=0;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                res+=2*minCost[i][j];
            }
        }
        return res;
    }


    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[][] cost=new int[n][n];
        for(int i=0;i<n;i++)
        {
            String[] strings=scanner.nextLine().split(" ");
            for(int j=0;j<n;j++)
            {
                cost[i][j]=Integer.parseInt(strings[j]);
            }
        }

//        for(int i = 0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//                System.out.println(cost[i][j]);
//        }

        int[][] minCost=new int[n][n];
        int res=0;
        for(int i=n-2;i>=1;i--)
        {
            res+=getCost(cost, i, minCost);
        }
        System.out.println(res);
    }
}
