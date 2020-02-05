package com.company;

class Address{
    private String address;

    public Address(String address){
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int[] scores = new int[3];

    public Student (String first, String last, Address home,Address school, int test1, int test2, int test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;

        this.scores[0] = test1;
        this.scores[1] = test2;
        this.scores[2] = test3;
    }

    public Student (String first, String last, Address home,Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    public String toString() {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Average=" + this.average() + " with Tests: " + this.scores[0] + "," + this.scores[1] + "," + this.scores[2] + "\n";
        return result;
    }

    public void setTestScore(int number, int score){
        this.scores[number-1] = score;
    }

    public int getTestScore(int test){
        return this.scores[test-1];
    }

    public int average(){
        return (int)(this.scores[0]+this.scores[1]+this.scores[2])/3;
    }
}
