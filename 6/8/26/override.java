
class Student{
    void study(){
        System.out.println("we are studying");
    }
}
class teacher extends Student{
    void study(){
        System.out.println("teacher are delevering lectures");
    }
}

 class override {
public static void main(String[] args){
    teacher t=new teacher();
    t.study();
    Student s= new Student();
    s.study();
}
    
}
