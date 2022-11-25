import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        int u=0,l=0,w=0,d=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to check");
        String str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                u++;
            if(Character.isLowerCase(str.charAt(i)))
                l++;
            if(Character.isDigit(str.charAt(i)))
                d++;
            if(Character.isWhitespace(str.charAt(i)))
                w++;
        }
        System.out.println("Number of upper case character:"+u);
        System.out.println("Number of lower case character:"+l);
        System.out.println("Number of digit character:"+d);
        System.out.println("Number of space character:"+w);
    }

}