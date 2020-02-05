package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student("Eugene", "Yesaulov", new Address("wer"),new Address("er"));
        System.out.println(st.toString());
    }
}
