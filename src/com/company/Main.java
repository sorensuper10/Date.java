package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String day = " Friday ";
    int date = 3;
    String month = " September ";
    int year = 2021;
    System.out.print("European Format:");
    System.out.print(day);
    System.out.print(date);
    System.out.print(month);
    System.out.print(year);

    day = " Friday, ";
    month = "September ";
    System.out.print(" American Format:");
    System.out.print(day);
    System.out.print(month);
    System.out.print(date);
    System.out.print(", ");
    System.out.print(year);
    }
}
