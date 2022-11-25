import java.util.Scanner;
class test
{
    static void test2(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                a=b-a;
        }
        System.out.println("The output "+a);
    }
    static void main()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the first numeber");
        int a=in.nextInt();
        System.out.println("Enter the second number");
        int b=in.nextInt();
        test ob=new test();
        ob.test2(a,b);
    }
}