package com.example.StudentMangementApp;

public class Student {


    private String name;

    private int age;

    private int admnNo;
    private String Country;

    public Student(String name, int age, int admnNo, String country) {
        this.name = name;
        this.age = age;
        this.admnNo = admnNo;
        this.Country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }



}
