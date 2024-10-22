package samp;
class Z extends Thread{
    int n;
    Z(String s,int v){
        super(s);
        n=v;
    }
 public void run(){
    try{
     int sum=0;
     for(int i=1;i<=n;i++){
        sum+=i;
        System.out.println("sum:"+sum);
        Thread.sleep(1000);
     }
    }catch(Exception e){}
 }
}

class Y extends Thread{
    int n;
    Y(String s,int v){
        super(s);
        n=v;
    }
 public void run(){
    try{
     int fact=1;
     for(int i=1;i<=n;i++){
      fact*=i;
        
        Thread.sleep(1000);
     }
     System.out.println("factorial:"+(fact));
    }catch(Exception e){}
 }
}

public class M4 {
    public static void main(String[] args) {
        Z z=new Z("Ace",5);
        Y y=new Y("Bonchan",5);
        z.start();
        y.start();
     try{
        Thread t=Thread.currentThread();
        for(int i=0;i<5;i++){
            System.out.println(t.getName());
         System.out.println("Ace "+z.isAlive());
         System.out.println("Bonchan "+y.isAlive());
         Thread.sleep(1000);
        }
     }catch(Exception e){}
    }
}
