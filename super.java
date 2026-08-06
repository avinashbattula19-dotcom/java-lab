class Student
{
    string name="anu";
}
class teacher  extends Student
{
    void display()
    {
        string name="bhanu";
        System.out.println("teacher name:"+name);
        System.out.println("student name:"+super.name);
    }

}
public class super {
    public static void main(string arge[])
    {
        teacher t=new teacher();
        t.display();
    }
    
}