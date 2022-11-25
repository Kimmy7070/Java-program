import java.lang.Math;
class Logic{
   private  double n,d;
    Logic(double num, double digit){
        n=num;
        d=digit;
    }
    int checking(){
        double r,m,s=0;
        m=n;
        while(n!=0){
            r=n%10;
            s=s+(Math.pow(r,d));
            n=n/10;
            d--;
        }
    if(s==m)
        return 1;
    else
        return 0; 
   }
}
public class Disarium_Number {
    public static void main(String []args){
        int t;
        Logic obj =new Logic(175,3);
        t= obj.checking();
        if(t==1)
          System.out.println("The number is disarium");
        else 
          System.out.println("The number is not disarium!");

    }
    
}
