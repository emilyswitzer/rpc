import java.net.*;
public class Client {
    public static void main(String[] argv)
    {
        LOGINSMPPROG client; // client is an instance of reverse class (i.e. the stub)
        if(argv.length <2)
        {	System.out.println("Usage: java reverseclient host text");
            System.exit(0);
        }
        try
        // call echo method in the stub
        {	client = new LOGINSMPPROG(InetAddress.getByName(argv[0]),true);
            String result = client.login_1(argv[1]);
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println("\nThe Exception is " + e.getMessage());

        }
        System.exit(0);
    }
}
