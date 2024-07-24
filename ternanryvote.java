import java.util.*;
class people 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age ");
        int a=sc.nextInt();
        String b=(a>17)?"eligible":"not eligible";
        System.out.println(b);
    }
}
