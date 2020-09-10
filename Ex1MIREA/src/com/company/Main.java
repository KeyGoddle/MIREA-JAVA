package com.company;

import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Archi", 2);
        Dog d2 = new Dog("Bim", 7);
        Dog d3 = new Dog("Dio");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    Book c1 = new Book("Idiot", 90);
    Book c2 = new Book("SAO", 700);
    Book c3 = new Book("JOJO");
        c3.setPage(120);
        System.out.println(c1);
        c1.intoPage();
        c2.intoPage();
        c3.intoPage();
        Ball ba1 = new Ball("Mikasa", 30);
        Ball ba2 = new Ball("Molten", 35);
        Ball ba3 = new Ball("Adidas");
        ba3.setRad(27);
        System.out.println(ba1);
        ba1.intoRad();
        ba2.intoRad();
        ba3.intoRad();
}
}