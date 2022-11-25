class Q1
{
    public static void main(String args[])
    {
        int add,sub,mul,rem,x,y;
        float div;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        add=x+y;
        sub=x-y;
        mul=x*y;
        div=x/y;
        rem=x%y;
        System.out.println("Addition:"+add+" Substraction:"+sub+" Multiplication:"+mul+" Division:"+div+" Reminder: "+rem);
    }
}