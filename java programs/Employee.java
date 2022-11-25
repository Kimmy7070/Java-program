import java.util.Scanner;
class Employee
{
    Employee()
    {
        int ei,es;
        String en,ed,eds;
    }
    Employee input(Employee arr[],int n)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Employee's ID");
        this.ei=in.nextInt();
        System.out.println("Enter the Employee's Name");
        this.en=in.nextLine();
        System.out.println("Enter the Employee's Department");
        this.ed=in.nextLine();
        System.out.println("Enter the Employee's Designation");
        this.eds=in.nextLine();
        System.out.println("Enter the Employee's Salary");
        this.es=in.nextLine();
        return this;
    }
    void output(int n)
    {
        System.out.println("Employee's ID:"+this.ei);
        System.out.println("Employee's Name:"+this.en);
        System.out.println("Employee's Department:"+this.ed);
        System.out.println("Employee's Designation:"+this.eds);
        System.out.println("Employee's Salary:"+this.es);
    }
    void search(String name)
    {
        if(this.en.equals(name)==0)
        {
            output(i);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit of the Employee,Must be greater than 10");
        int n=in.nextInt();
        Employee arr[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Employee(arr[i].input(i));
        }
        for(int i=0;i<n;i++)
        {
            arr[i].output(i);
        }
        System.out.printlln("Enter the name of the employee's name you want to find");
        String name=in.nextLine();
        for(int i=0;i<n;i++)
        {
            arr[i].search(name);
        }
    }
}