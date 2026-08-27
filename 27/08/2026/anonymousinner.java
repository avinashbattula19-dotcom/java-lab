public class anonymousinner {
    public static void main(String args[]){
        person p = new person() {
            @Override
            void eat() {
                System.out.println("nice test");
            }
        };
        p.eat();
    }
    
}
abstract class person{
    abstract void eat();
}
