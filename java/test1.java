import java.util.Scanner;
class test1
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first numeber");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        while(a!=b)
        {
            System.out.println("While loop");
            if(a>b)
                a=a-b;
            else
                a=b-a;
        }
        System.out.println("The output "+a);
    }
}