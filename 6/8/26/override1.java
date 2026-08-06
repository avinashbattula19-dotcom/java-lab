class Student
{
    void study()
    {
        System.out.println("we are studying");
    }
}
class teacher extends Student
{
    void study()
    {
        super.study();
        System.out.println("Teachers are delevering lectures ");

    }
}
public class override1 {
    public static void main(string...args){
        teacher t= new teacher();
        t.study();
    }
    
}
