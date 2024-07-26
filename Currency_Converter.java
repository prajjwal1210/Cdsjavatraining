import java.util.*;
class convert
{
    public static void main(String[] args)
    {
        System.out.println("Select 1 for INR to USD convert");
        System.out.println("Select 2 for USD to INR convert");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                inr();
                break;

            case 2:
                usd();
                break;

            default:
                System.out.println("Invalid option selected");
        }
    }
    public static void inr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your INR amount");
        float f=sc.nextFloat();
        System.out.println("Amount in USD is"+ (f*0.012));
    }
    public static void usd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your USD amount");
        float f1=sc.nextFloat();
        System.out.println("Amount in INR is"+ (f1*83.78));
    }
}