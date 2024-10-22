package samp;
class child extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Child thread "+i);
                Thread.sleep(1000);
            }
        }catch(Exception o){

        }
    }
}



public class Mthread2 {
    public static void main(String[] args) {
        child c=new child();
        c.start();
        try{
            for(int i=0;i<10;i++){
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){

        }
    }
    
}
