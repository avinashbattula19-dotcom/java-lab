 class hospital {
    hospital(String Hospitalname)
    {
        System.out.println("Hospital name:"+Hospitalname);
    }
    
}
class Doctor extends hospital{
    Doctor(){
        super("Apollo");
        System.out.println("Doctor name:Arun");
    }
}
public class Doc{
    public static void main(String args[]){
        Doctor d=new Doctor();
    }
}
