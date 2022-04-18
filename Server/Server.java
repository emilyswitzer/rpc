import com.distinct.rpc.*;
public class Server extends  LOGINSMPPROGServer {
    String  username = "admin";
    String password = "password";
    public static void main(String[] args)
    {
        try
        {	new Server(); // creates an instance of the Server stub
        }
        catch (RPCError e)
        {	System.out.println(e.getMessage());
        }
    }

    public Server() throws RPCError
    {	super();
    }
    // override the echo_1 method from the stub – where it does nothing
    public String login_1(String a)
    {
      //  StringBuffer sb = new StringBuffer(a);
       // return sb.reverse().toString();

        String user[] = a.split(" ");

        if (username.equals(user[0]) && password.equals(user[1])) {
            return "Client successfully logged in";
        }
        return "Error username or password is incorrect";
    }
}
