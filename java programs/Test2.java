import java.util.Scanner;
class Test2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        String n="";
        for(int i=str.length()-1;i>=0;i--)
        {
            n+=str.charAt(i);
        }
        System.out.println("The reverse string is "+n);
    }
}