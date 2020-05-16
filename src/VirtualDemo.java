import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VirtualDemo
{
    class point
    {
        int x;
        int y;
        int d;
        point(int x,int y)
        {
            this.x=x;
            this.y=y;
            this.d=x*x+y*y;
        }
    }


    public int[][] kClosest(int[][] points, int K)
    {
        point[] a=new point[points.length];
        for(int i=0;i<points.length;i++)
        {
            a[i]=new point(points[i][0],points[i][1]);
        }
        Arrays.sort(a, new Comparator<point>() {
            @Override
            public int compare(point o1, point o2) {
                return o1.d-o2.d;
            }
        });
        List<int[]> res=new ArrayList<>();
        for(int i=0;i<K;i++)
        {
            res.add(new int[]{a[i].x,a[i].y});
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        String s="4342343";
        int a=Integer.valueOf(s);
        System.out.println(a);
    }
}