public class exception3 {
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c;
        try{
            c=a/b;
            System.out.println("the value is:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("this is an exception");
        }
    }
    
}
