class Q8
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int sum=0;
        while(x>0)
        {
            int d=x%10;
            sum+=d;
            x=x/10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}