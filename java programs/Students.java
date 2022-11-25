import java.util.Scanner;
class Students{
    private String sName;
    private String sCity;
    private String sEmail;
    private long sPhone;
    private double sX;
    private double sXII;
    void getStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        sName=sc.nextLine();
        System.out.print("Enter City: ");
        sCity=sc.nextLine();
        System.out.print("Enter Email: ");
        sEmail=sc.nextLine();
        System.out.print("Enter Phone Number: ");
        sPhone=sc.nextLong();
        System.out.print("Enter Class X%: ");
        sX=sc.nextDouble();
        System.out.print("Enter Class XII%: ");
        sXII=sc.nextDouble();
    }
    void printStudent(){
        System.out.println("Name: " +sName);
        System.out.println("City: " +sCity);
        System.out.println("Email: " +sEmail);
        System.out.println("Phone Number: " +sPhone);
        System.out.println("Class X% " +sX);
        System.out.println("Class XII%: " +sXII);
    }
}

class BCA extends Students{
    private double sComp;
    void getData(){
        Scanner sc = new Scanner(System.in);
        getStudent();
        System.out.print("Enter Class XII Computer Sc/App %: ");
        sComp=sc.nextDouble();
    }
    void print(){
        printStudent();
        System.out.println("Class XII Computer Sc/App %: " +sComp);
    }
}
class BBA extends Students{
    private double sEnglish;
    void getData(){
        Scanner sc = new Scanner(System.in);
        getStudent();
        System.out.print("Enter Class XII English %: ");
        sEnglish=sc.nextDouble();
    }
    void print(){
        printStudent();
        System.out.println("Class XII English %: " +sEnglish);
    }
}
class MCA extends Students{
    private double sGrad;
    private double sMath;
    void getData(){
        Scanner sc = new Scanner(System.in);
        getStudent();
        System.out.print("Enter Graduation %: ");
        sGrad=sc.nextDouble();
        System.out.print("Enter Graduation Math %: ");
        sMath=sc.nextDouble();
    }
    void print(){
        printStudent();
        System.out.println("Graduation %: " +sGrad);
        System.out.println("Graduation %: " +sMath);
    }
}

class StudentAdmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Press 1 for BCA Admission");
        System.out.println("Press 2 for BBA Admission");
        System.out.println("Press 3 for MCA Admission");
        System.out.print("Enter your choice: ");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                BCA bca = new BCA();
                bca.getData();
                bca.print();
            break;
            case 2:
                BBA bba = new BBA();
                bba.getData();
                bba.print();
            break;
            case 3:
                MCA mca = new MCA();
                mca.getData();
                mca.print();
            break;
            default:
                System.out.println("Invalid Choice...");
            break;
        }
    }
}
