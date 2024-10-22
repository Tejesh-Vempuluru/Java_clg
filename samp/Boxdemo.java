package samp;
class Box{
    double l,b,h;
    Box(){
        l=b=h=0;
    }

    Box(double x,double y,double z){
        l=x;
        b=y;
        h=z;
    }

    Box(Box temp){
        l=temp.l;
        b=temp.b;
        h=temp.h;

    }
    void display(){
        System.out.println("length:"+l+" b:"+b+" h: "+h);
    }
    void vol(){
        System.out.println("vol:"+(l*b*h));
    }
    void comp(Box temp){
        System.out.println("l:"+l+" b:"+b+" h: "+h);
        double v1=l*b*h;
        System.out.println("l:"+temp.l+" b:"+temp.b+" h: "+temp.h);
        double v2=temp.l*temp.b*temp.h;
        if(v1==v2)
        System.out.println("Equal");
        else if(v1<v2)
        System.out.println("invok ob id lesser");
        else
        System.out.println("invok ob is high");
    }

    void comp(double x,double y,double z){
        double v1=x*y*z;
        System.out.println("l:"+l+" b:"+b+" h:"+h);
        System.out.println("x:"+x+" y:"+y+" z:"+z);
        double v2=l*b*h;
        if(v1==v2)
        System.out.println("Equal");
        else
        System.out.println("not");
    }
}

public class Boxdemo {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(2,3,4);
        Box b3=new Box(b2);
        b1.display();
        b1.vol();
        b2.display();
        b2.vol();
        b3.display();
        b3.vol();
        b2.comp(b1);
        b2.comp(3,4,5);
    }
    
}
