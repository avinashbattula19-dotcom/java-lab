class Student
{
    String name="anu";
}
class teacher extends Student
{
    void show()
    {
        String name="bhanu";
        System.out.println("teacher name:"+name);
        System.out.println("student name:"+super.name);
    }

}
public class Demo {

    public static void main(String[] args)
    {
        teacher t=new teacher();
        t.show();
    }
    
}