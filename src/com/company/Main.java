package com.company;

public class Main {

    public static void main(String[] args) {
	Holiday c = new Holiday("Christmas", 12 , 25,"A very jolly holiday", true);
    c.isToday();
        System.out.println(c.getName());
        System.out.println(c.isToday());

    }
}
