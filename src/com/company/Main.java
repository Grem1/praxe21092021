package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Vyber si operaci - k,s,help");
        int chosen=scan.nextInt();

        switch (chosen){
            case "k":
                cal();
                break;
            case "s":
                sen();
                break;
            case "help":
                showHelp();
                break;
            default:
                showHelp();
                break;
        }
    }

    private static void showHelp() {
        System.out.println("Commands to use : k,s");
    }

    public static void sen() {
        Scanner scans=new Scanner(System.in);
        System.out.println("Zadej slovo");
        char[] validSymbols;
        validSymbols = new char[]{'a','e','i','o','u',};
        String word=scans.nextLine();
        if (word.contains(validSymbols)){
            System.out.println("Věta obsahuje samohlasky");
        }else {
            System.out.println("toto slovo neobsahuje samohlásku");
        }
    }
    public static void cal(){
        Scanner scank=new Scanner(System.in);
        double a=scank.nextDouble();
        double b=scank.nextDouble();
    }
}


