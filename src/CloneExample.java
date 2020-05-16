public class CloneExample
{
    private int a;
    private int b;

    @Override
    public CloneExample clone() throws CloneNotSupportedException
    {
        return (CloneExample)super.clone();
    }

    public static void main(String[] args)
    {
        final int a;
    }
}

