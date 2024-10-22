package samp;

class A extends Thread{
    public void run(){
        try{
        int  sum=0;
     for(int i=0;i<=10;i++){
        System.out.println(getName());
        sum=sum+i;
        System.out.println("sum:"+sum);
        Thread.sleep(1000);
     }
        }catch(Exception e){

        }
    }
    
    A(String s){
        super(s);
    }
    
}



public class M {
    public static void main(String[] args) {
        A a=new A("child1");
        a.start();
        try{
            for(int i=0;i<10;i++){
                System.out.println("main:"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){}
    }
    
}
