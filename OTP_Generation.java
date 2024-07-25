import java.util.Random;
class otp
{
    public static void main(String args[])
    {
        Random ra=new Random();
        int otp=ra.nextInt(1000);
        System.out.println("Random number is:"+otp);

    }
}
