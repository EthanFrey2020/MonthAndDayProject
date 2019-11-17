package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create method 3 methods
        //Ned 5 commits
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What day were you born on? (Number only)");
        int dayOfMonth = keyboard.nextInt();
        System.out.println("What month were you born in? (Month number January is 1 ... December is 12)");
        int month = keyboard.nextInt();
        System.out.println("What year were you born on?");
        int year = keyboard.nextInt();
    }
}
