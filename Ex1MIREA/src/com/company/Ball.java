package com.company;
import java.lang.*;
public class Ball {
    private String mark;
    private int Rad;
    public Ball (String n, int a){
        mark = n;
        Rad = a;
    }
    public Ball(String n){
        mark = n;
        Rad = 0;
    }
    public Ball(){
        mark= "Ball";
        Rad = 0;
    }
    public void setRad(int Rad) {
        this.Rad = Rad;
    }
    public void setMark(String Mark) {
        this.mark = mark;
    }
    public String getMark(String mark){
        return mark;
    }
    public int getRad() {
        return Rad;
    }
    public String toString(){
        return this.mark+", Radius "+this.Rad;
    }
    public void intoRad(){
        System.out.println(mark +" with radius "+Rad);
    }
}
