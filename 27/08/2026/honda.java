//package 27.08.2026;
 class bike {
    void run(){
        System.out.println("running safely with 100kmph");
    }
    
}
class honda extends bike{
    void run(){
        System.out.println("running safely");

    }
    public static void main(String args[]){
        honda h= new honda();
        h.run();
        h.run();

    }
}
