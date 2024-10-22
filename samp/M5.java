package samp;
class C implements Runnable{
   public void run(){
    try{Thread t=Thread.currentThread();
        for(int i=1;i<=10;i++){
            System.out.println(t.getName()+i);
            Thread.sleep(1000);
        }
    }catch(Exception e){}
   } 
}


public class M5 {
    public static void main(String[] args) {
        C c=new C();
        Thread t=new Thread(c,"CSE");
        t.start();

    }
}
