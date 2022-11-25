class Q10
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        for(int i=1;i<=x;i++)
        {
            for(int s=x;s>i;s--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int k=i-1;k>0;k--)
                System.out.print(k);
            System.out.println();
        }
    }
}