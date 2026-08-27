import java.io.*;
public class console {
    public static void main(String args[]){
        String name;
        System.out.println("enter you name:");
        Console c = System.console();
        name=c.readLine();
        System.out.println("your name is:"+name);
    }
    
}
