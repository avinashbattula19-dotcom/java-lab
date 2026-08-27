public class exception2 {
    public static void main(String args[]){
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("the value is:"+c);

        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception");

        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
        
    }
    
}
