package com.company.java_core.homework13.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction extends Deputy{
    Scanner sc = new Scanner(System.in);

    public Fraction(double weight, double height, String name,
                    String surname, int age, boolean bribeTaker) {
        super(weight, height, name, surname, age, bribeTaker);
    }

    public Fraction(){
        super();
    }

    public Fraction addDeputy() {
        System.out.println("Enter the name of the deputy: ");
        String name = sc.nextLine();

        System.out.println("Enter the surname of the deputy: ");
        String surname = sc.nextLine();

        System.out.println("Enter the age of the deputy: ");
        int age = sc.nextInt();

        System.out.println("Enter the weight of the deputy: ");
        double weight = sc.nextDouble();

        System.out.println("Enter the height of the deputy: ");
        double height = sc.nextDouble();

        System.out.println("Is the entered deputy a bribe-taker? (true or false): ");
        boolean bribeTaker = sc.hasNextBoolean();
        return null;
    }

    public Fraction removeDeputy() {
        System.out.println("Enter the name of deputy: ");
        String name = sc.next();

        return null;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "sc=" + sc +
                '}';
    }
}
