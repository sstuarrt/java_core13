package com.company.java_core.homework13.task1;

import java.util.Scanner;

public class Deputy extends Human{
    private String name;
    private String surname;
    private int age;
    private boolean bribeTaker;
    private int bribe;

    public Deputy() {
        super();
    }

    public Deputy(double weight, double height, String name, String surname,
                  int age, boolean bribeTaker) {
        super(weight, height);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bribeTaker = bribeTaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }

    public void bribeGive() {
        if(bribeTaker == false) {
            System.out.println("This deputy is not a bribe-taker!");
        } else {
            System.out.println("Enter size of bribe: ");
            Scanner sc = new Scanner(System.in);
            int bribeGiven = sc.nextInt();

            if(bribeGiven > 5000) {
                System.out.println("Police will take the bribe-taker.");
            } else {
                bribe += bribeGiven;
            }
        }
    }
}
