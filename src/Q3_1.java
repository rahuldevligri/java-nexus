import java.util.Scanner;
//Abstraction
interface A{//by default package public abstract
    float PI = 3.141f;//by default public static final
   
    void getdata();//by default public abstract
    void display();//by default public abstract
    void calc_area();//by default public abstract
}
//Inheritance
//super class or parent class or base class
class B implements A{//default public scope within a package
    //instance member method
    private int radius; 
    private float area;

    //instance member method
    public void getdata(){//override
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of Circle: ");
        radius= sc.nextInt();
    }
    public void calc_area(){//overeride
        area = ((float)radius*PI*radius);
    }
    public void display(){//override
        System.out.println("Area of Circle is "+area);
    }
}
class C extends B{// sub class or child class or derived class
    //Polymorphism
    void sum(int a, int b){
        int c = a+b;
        System.out.println("Sum of a+b is: "+(a+b));
    } 
    void sum(int a,float b){
        float c = a+b;
        System.out.println("Sum of a+b is: "+(a+b));
    } 
    void sum(float a,int b){
        float c = a+b;
        System.out.println("Sum of a+b is: "+(a+b));
    }
    void sum(float a,float b){
        float c = a+b;
        System.out.println("Sum of a+b is: "+(a+b));
    }
}
public class Q3_1 {
    public static void main(String...args){
        //we can call common methods of A & B 
        A a;//we cannot create object of a interface
        a = new B();//parent's and child's object
        a.getdata();//RTB
        a.calc_area();//RTB
        a.display();//RTB

        //reference and object are child class
        B b = new B();
        b.getdata();//CTB
        b.calc_area();//CTB
        b.display();//CTB

        //RTB
        B c = new C();
        c.getdata();//RTB
        c.display();//RTB
        c.calc_area();//RTB
        //but we can't call child's methods that are not present in parent class
        //c.sum(5,6); <- give error
        
        C d = new C();
        d.sum(5,6);//int int
        d.sum(5,6.0f);//int float
        d.sum(7.0f,8);//float int 
        d.sum(5.0f,6.0f);//float float

    }
}
