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


    public static void main(String[] args) {
        Complex x = new Complex(7.0, 2.0);
        Complex y = new Complex(5.0, 4.0);
        System.out.println(x.abs());
        System.out.println(y.abs());
        System.out.println(x.add(y));
    }

    public String toString()
    {
        String s = real + " + " + imagine + "i";
        return s;
    }


}
