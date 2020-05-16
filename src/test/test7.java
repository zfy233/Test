package test;

import java.util.Scanner;

public class test7
{

    int total=Integer.MAX_VALUE;
    boolean[][] visited;
    int[][] grid;
    int[] start;
    int[] end;
    int[][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    public int minCost(int[][] grid,int[] start,int[] end)
    {
        visited=new boolean[grid.length][grid.length];
        this.grid=grid;
        this.start=start;
        this.end=end;
        dfs(start[0],start[1],0,1);
        return total;
    }

    private boolean inArea(int x,int y)
    {
        return x>=0&&x<grid.length&&y>=0&&y<grid[0].length;
    }

    public void dfs(int x,int y,int cur,int state)
    {
        if(x==end[0]&&y==end[1])
        {
            total=total>cur? cur:total;
            return;
        }

        if(cur>total) return;

        for(int[] dir:dirs)
        {
            int newX=x+dir[0];
            int newY=y+dir[1];
            if(inArea(newX,newY)&&!visited[newX][newY])
            {
                visited[newX][newY]=true;
                int sum=grid[newX][newY]*state;
                int newState=sum%4+1;
                dfs(newX, newY,cur+sum,newState);
                visited[newX][newY]=false;
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[][] map=new int[6][6];
        for(int i=0;i<6;i++)
        {
            String tmp=scanner.nextLine();
            String[] strs=tmp.split(" ");
            for(int j=0;j<6;j++)
            {
                map[i][j]=Integer.parseInt(strs[j]);
            }
        }

        int[] start=new int[2];
        int[] end=new int[2];
        String tmp=scanner.nextLine();
        String[] strs=tmp.split(" ");
        start[0]=Integer.parseInt(strs[0]);
        start[1]=Integer.parseInt(strs[1]);
        end[0]=Integer.parseInt(strs[2]);
        end[1]=Integer.parseInt(strs[3]);
        test7 test7=new test7();
        System.out.println(test7.minCost(map, start, end));
    }
}
