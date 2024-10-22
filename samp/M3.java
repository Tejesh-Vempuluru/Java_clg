package samp;
class C extends Thread{
    int n;
    C(String s,int v){
       super(s);
       n=v;
    }

    public void run(){
        try{
            System.out.println(getName());
            for(int i=1;i<10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
            Thread.sleep(1000);
             
            }
        }catch(Exception e){}
    }
}

public class M3 {
    public static void main(String[] args) {
        C c=new C("Luffy",2);
        C c1=new C("Ussop",5);
        c.start();       
        c1.start();
    }
}
