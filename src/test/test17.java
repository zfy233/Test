package test;

import java.util.*;

public class test17
{
    int[] root=new int[100];

    private void setRoot()
    {
        for(int i=0;i<root.length;i++)
            root[i]=i;
    }

    private int find(int x)
    {
        while(x!=root[x])
        {
            root[x]=root[root[x]];
            x=root[x];
        }
        return x;
    }

    private void union(int a,int b)
    {
        int rootA=find(a);
        int rootB=find(b);
        root[rootA]=rootB;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        int m=Integer.parseInt(strings[0]);
        int n=Integer.parseInt(strings[1]);
        int[][] dist=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=-1;
            }
            dist[i][i]=0;
        }

        test17 test17=new test17();
        test17.setRoot();
        int cost=1;
        for(int i=0;i<n;i++)
        {
            String[] strs=scanner.nextLine().split(" ");
            int a=Integer.parseInt(strs[0]);
            int b=Integer.parseInt(strs[1]);
            int rootA=test17.find(a);
            int rootB=test17.find(b);
            if(rootA!=rootB)
            {
                dist[a][b]=dist[b][a]=cost;
                for(int j=0;j<m;j++)
                {
                    if(test17.find(j)==rootA)
                    {
                        for(int k=0;k<m;k++)
                        {
                            if(test17.find(k)==rootB)
                            {
                                dist[j][k]=(dist[a][b]+dist[j][a]+dist[k][b])%100000;
                                dist[k][j]=dist[j][k];
                            }
                        }
                    }
                }
                test17.union(a, b);
            }
            cost=(cost*2)%100000;
        }
        for(int i=1;i<m;i++)
        {
            System.out.println(dist[0][i]);
        }
    }
}

