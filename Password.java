import java.util.Random;
class password
{
    public static void main(String args[])
    {
        String ch="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String pass=" ";
        Random ra= new Random();
        for(int i=0;i<8;i++)
        {
            int p=ra.nextInt(ch.length());
            pass=pass+ch.charAt(p);
        }
        System.out.println("Password of required length is :"+" "+pass);
    }
}
