package com.company;

import java.lang.ref.PhantomReference;
import java.net.PortUnreachableException;

public class Triangle extends Shape {
    private double canhA;
    private double canhB;
    private double canhC;

    public Triangle() {

    }

    public Triangle(String color,boolean filled,double canhA, double canhB, double canhC) {
        super(color,filled);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
    public double getPerimeter(){
        return this.canhA+this.canhB+this.canhC;
    }
    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
    }

    public String toStringOn(){
        return "CanhA: "+this.canhA+"\n"+
                "CanhB: "+this.canhB+"\n"+
                "CanhC: "+this.canhC+"\n"+
                "Color: "+super.getColor()+"\n"+
                "Perimeter: "+getPerimeter()+"\n"+
                "Area: "+getArea()+"\n\n";

    }

    public String toStringOff(){
        return "CanhA: "+this.canhA+"\n"+
                "CanhB: "+this.canhB+"\n"+
                "CanhC: "+this.canhC+"\n"+
                "Perimeter: "+getPerimeter()+"\n"+
                "Area: "+getArea()+"\n\n";

    }
}
