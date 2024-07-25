import java.util.*;
class length
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lenght");
        int l=sc.nextInt();
        System.out.println("Enter th breadth");
        int b=sc.nextInt();
        int a=area(l,b);
        System.out.println("Area is"+a);
    }

    private static int area(int l, int b)
    {
        return (l*b);
    }
}