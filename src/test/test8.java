package test;

import java.util.Scanner;

public class test8
{
    int res=Integer.MAX_VALUE;
    private int[][] grid;
    private boolean[][] visited;
    int[][] dirs=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

    private boolean inArea(int i,int j)
    {
        return i>=0&&i<grid.length&&j>=0&&j<grid[0].length;
    }

    private int cal(int[] start,int[] end,int[][] grid)
    {
        this.grid=grid;
        visited=new boolean[grid.length][grid[0].length];
        dfs(start[0],start[1],end,0, 1);
        return res;
    }

    private void dfs(int i,int j,int[] end,int cur,int state)
    {
        visited[i][j]=true;
        if(i==end[0]&&j==end[1])
        {
            res=Math.min(res, cur);
            return;
        }

        for(int[] dir:dirs)
        {
            int newX=i+dir[0];
            int newY=j+dir[1];
            if(inArea(newX, newY)&&!visited[newX][newY])
            {
                int tmp=grid[newX][newY]*state;
                int newState=(tmp)%4+1;
                dfs(newX, newY, end, cur+tmp, newState);
                visited[newX][newY]=false;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[][] grid=new int[6][6];
        for(int i=0;i<6;i++)
        {
            String[] strs=scanner.nextLine().split(" ");
            for(int j=0;j<6;j++)
            {
                grid[i][j]=Integer.parseInt(strs[j]);
            }
        }
        String[] strings=scanner.nextLine().split(" ");
        int[] start=new int[2];
        int[] end=new int[2];
        start[0]=Integer.parseInt(strings[0]);
        start[1]=Integer.parseInt(strings[1]);
        end[0]=Integer.parseInt(strings[2]);
        end[1]=Integer.parseInt(strings[3]);

        test8 test8=new test8();
        System.out.println(test8.cal(start, end, grid));
    }
}
