package com.company;

public class Complex {
    private double real;
    private double imagine;

    public Complex(double r, double i){
        real = r;
        imagine = i;
    }
    public Complex(double r){
        this(r, 0.0);
    }

    public double abs(){
        double a = Math.pow(real,2.0);
        double b = Math.pow(imagine,2.0);
        double result = Math.sqrt(a+b);
        return result;
    }

    public Complex add(Complex other){
        double r = real + other.real;
        double i = imagine + other.imagine;
        Complex nComplex = new Complex(r, i);
        return nComplex;
    }

    public Complex add(double other){
        double r = real + other;
        Complex nComplex = new Complex(r, imagine);
        return nComplex;
    }

    public Complex multiply(Complex other){
        double r = (real * other.real) - (imagine * other.imagine);
        double i = (real * other.imagine) + (imagine * other.real);
        Complex qComplex = new Complex(r,i);
        return qComplex;
    }

    public Complex multiply(double other){
        double r = (real * other);
        double i = (imagine * other);
        Complex qComplex = new Complex(r,i);
        return qComplex;
    }

    public String toString()
    {
        String s = real + " + " + imagine + "i";
        return s;
    }


    public static void main(String[] args) {
        Complex x = new Complex(7.0, 2.0);
        Complex y = new Complex(5.0, 4.0);
        Complex z = new Complex(0.0, 1.0);
        Complex xy = new Complex(2.0, -4.5);
        Complex xz = new Complex(6.0);
        Complex yz = new Complex(3.0);

        System.out.println("abs");
        System.out.println(x.abs());
        System.out.println(z.abs());
        System.out.println(xy.abs());
        System.out.println();
        System.out.println("add");
        System.out.println(x.add(y));
        System.out.println(z.add(xz));
        System.out.println(xy.add(yz));
        System.out.println(z.add(5.0));
        System.out.println();
        System.out.println("multiply");
        System.out.println(x.multiply(y));
        System.out.println(xz.multiply(x));
        System.out.println(y.multiply(xy));
        System.out.println(yz.multiply(4.0));
    }
}

