public class s1
{
    public static void main(String[] args) {
        int i=10;
        int n=i++%5;
        int m=++i%5;
        System.out.println("i="+i+"n="+n+"m="+m+"sum="+(i+n+m));
    }
}