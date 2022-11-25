class Q7
{
    public static void main(String args[])
    {
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        if(x==y)
        {
            System.out.println(x+"=="+y);
            System.out.println(x+"<="+y);
            System.out.println(x+">="+y);
        }
        else if(x>y)
        {
            System.out.println(x+"!="+y);
            System.out.println(x+">"+y);
            System.out.println(x+">="+y);
        }
        else
        {
            System.out.println(x+"!="+y);
            System.out.println(x+"<"+y);
            System.out.println(x+"<="+y);
        }
    }
}