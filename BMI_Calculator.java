import java.util.*;
class bmi
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the height in meter");
        float h=sc.nextFloat();
        System.out.println("Enter the weight in kilogram");
        float w=sc.nextFloat();
        float b=w/(h*h);
        System.out.println("BMI of person is:"+" "+b);
        if(b<18.5)
        {
            System.out.println("Person is underweight");
        }
        else if(b>=18.5 && b<=24.9)
        {
            System.out.println("Person is normal");
        }
        else
        {
            System.out.println("Person is overweight");
        }
    }
}
