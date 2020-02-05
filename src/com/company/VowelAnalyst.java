package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class VowelAnalyst{

    private static Map<Character, Integer> result = new HashMap<>();
    private static Scanner scan = new Scanner(System.in);

    public VowelAnalyst(){
        VowelAnalyst.result.put('a',0);
        VowelAnalyst.result.put('e',0);
        VowelAnalyst.result.put('i',0);
        VowelAnalyst.result.put('o',0);
        VowelAnalyst.result.put('u',0);
        VowelAnalyst.result.put('_',0);
    }
    
    public static void main(String []args){

        System.out.print("enter string: ");

        new VowelAnalyst();

        countVowels(VowelAnalyst.scan.nextLine());
        
        System.out.println(VowelAnalyst.toStr());

    }

    public static void countVowels(String str){
        for (int i = 0; i < str.length(); i++){
            if (VowelAnalyst.result.containsKey(str.charAt(i))){
                VowelAnalyst.result.replace(str.charAt(i),VowelAnalyst.result.get(str.charAt(i)) + 1);
            }else{
                VowelAnalyst.result.replace('_',VowelAnalyst.result.get('_') + 1);
            }
        }
    }


    public static String toStr(){
        AtomicReference<String> res = new AtomicReference<>("");
        VowelAnalyst.result.forEach((key, value) -> {
            if (key != '_'){
                res.set(res.get() + key + ": " + value + "\n");}
            else{
                res.set(res + "other: " + value + "\n");}
        });

        return res.get();
    }
}