package com.company;

import java.util.Scanner;
public class BottlesofBeer{

    private static Scanner scan = new Scanner(System.in);
    final static int totalVerses = 100;

    public static void main(String []args){

        System.out.print("Enter number of verses to sing:");
        while(!BottlesofBeer.scan.hasNextInt()){
            System.out.print("Enter a number of verses to sing:");
            BottlesofBeer.scan.next();
        }

        int amountTime = BottlesofBeer.scan.nextInt();

        for (int i = 0; i <  amountTime; i++){
            BottlesofBeer.printVersesOfBottlesOfBeer(BottlesofBeer.totalVerses - i);
        }


    }
    public static void printVersesOfBottlesOfBeer(int number){
        System.out.println(number + " bottles of beer on the wall");
        System.out.println(number + " bottles of beer");
        System.out.println("If one of those bottles should happen to fall");
        System.out.println((number - 1) + " bottles of beer on the wall");
        System.out.println();
    }
}