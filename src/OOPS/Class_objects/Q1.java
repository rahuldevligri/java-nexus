/*
1. Define a class Q1_ReverseString to represent a complex number.
Declare instance member variables to store real and imaginary
part of a complex number, also define instance member functions
to set values of complex number and print values of complex number
*/
package OOPS.Class_objects;

class Complex {
    private double real;
    private double imaginary;

    public void setValues(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void printComplex() {
        if(imaginary >= 0){
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " + " + (-imaginary) + "i");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Complex c1 = new  Complex();
        c1.setValues(10, 20);
        c1.printComplex();
    }
}
