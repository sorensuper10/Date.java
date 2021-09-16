package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String day = " Friday ";
    int date = 3;
    String month = " September ";
    int year = 2021;

    System.out.print("European Format:");
    System.out.println(day+date+month+year);

    day = " Friday, ";
    month = "September ";
    System.out.print("American Format:");
    System.out.println(day+month+date+", "+year);
    }
}
