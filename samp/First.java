package samp;
public class First {
    static int add(int x,String y){
        try{
           int n=Integer.parseInt(y);
           System.out.println(n);
           return x/n;
         }
         catch(ArithmeticException e)
         { System.out.println("division by zero");}
         catch(NumberFormatException ne)
         {System.out.println("Input is not in format");}
         finally{
           System.out.println("In Finally");
           
         }
         return 0;
       }
       public static void main(String[] args) {
           System.out.println(add(10,"5"));
           System.out.println(add(10,"0"));
           System.out.println(add(10,"4.5"));
           System.out.println(add(10,"2"));
        }
   }

