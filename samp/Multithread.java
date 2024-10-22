package samp;
public class Multithread {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setName("SASTRA");
        System.out.println(t.getName());

        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
           
        }
    }

}
