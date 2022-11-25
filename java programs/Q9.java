class Q9
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        System.out.println("Area of the hexagon:"+((6*Math.pow(x,2))/(4*(Math.tan(Math.toRadians(30))))));
    }
}