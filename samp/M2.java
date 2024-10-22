package samp;
class B extends Thread{
    B(String s){
    super(s);}
 public void run(){
    try{
       Thread t=Thread.currentThread();
        for(int i=0;i<10;i++){
            System.out.println(t.getName());
            Thread.sleep(1000);
        }
    }catch(Exception e){}
 }

}

public class M2 {
    public static void main(String[] args) {
        B b=new B("Zoro");
        b.start();
        B b1=new B("Sanji");
        b1.start();
        try{
            Thread t=Thread.currentThread();
            for(int i=0;i<10;i++){
                System.out.println(t.getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){}
    }
    
}
