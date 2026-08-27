
import java.io.Console;
public class console {
    public static void main(String args[])
    {
        String name;
        System.out.println("enter your name");
        Console c= System.console();
        name =c.readLine();
        System.out.println("your name is:"+name);

    }
    
}
