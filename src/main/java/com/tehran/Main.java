package com.tehran;

/**
 * Created by ahadi.masoud on 1/7/2018.
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(12);
        p1.setName("Masoud");
        p1.setFamily("Ahadi");
        System.out.println(p1.getName() + " " + p1.getFamily());
    }
}
