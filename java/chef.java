import java.util.Scanner;
class chef
{
    static void main()
    {
        int T,x,m,d;
        Scanner in=new Scanner(System.in);
        T=in.nextInt();
        int a[] = new int [T];
        for(int i=0;i<T;i++)
        {
            String line =in.nextLine();
            String[] num = line.split();
            
            int l = x*d;
            if (l<d)
            a[i] = l;
            else
            a[i] = d;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(a[i]);
        }
    }
}