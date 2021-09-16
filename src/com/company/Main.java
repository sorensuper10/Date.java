package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String day = " Friday ";
    int date = 3;
    String month = " September ";
    int year = 2021;
        //TODO samle sout, så de står i én med + operatoren i mellem dem, samt lave en System.out.println(). Alt står på en linje.
    System.out.print("European Format:"); 
    System.out.print(day);
    System.out.print(date);
    System.out.print(month);
    System.out.print(year);

    day = " Friday, ";
    month = "September ";
    System.out.print(" American Format:"); //TODO gøre det samme som i European Format med sout. 
    System.out.print(day);
    System.out.print(month);
    System.out.print(date);
    System.out.print(", ");
    System.out.print(year);
    }
}
