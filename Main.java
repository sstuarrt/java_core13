package com.company.java_core.homework13.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Fraction> deputyList = new ArrayList<>();

        Iterator<Fraction> iterator = deputyList.iterator();

        while (true) {
            menu();
            System.out.println("Enter number: ");
            String num = sc.next();
            switch (num) {
                case "1" -> {
                    deputyList.add(new Fraction().addDeputy());
                }

                case "2" -> {
                    while (iterator.hasNext()) {
                        Fraction next = iterator.next();

                        Collection<Fraction> objects = deputyList;
                        if (next.getName().equalsIgnoreCase(String.valueOf(objects))) {
                            deputyList.remove(next);
                        }
                    }
                }

                case "3" -> {
                    while (iterator.hasNext()) {
                        Fraction next = iterator.next();

                        if (next.isBribeTaker()) {
                            next.bribeGive();
                            System.out.println(next);
                        }
                    }
                }

                case "4" -> {
                    while (iterator.hasNext()) {
                        Fraction next = iterator.next();
                        //System.out.println(Collections.max(deputyList));
                    }
                }

                case "5" -> {
                    Fraction next = iterator.next();
                    Collection<Fraction> objects = deputyList;
                    System.out.println(deputyList.equals(objects));
                }

                case "6" -> {
                    deputyList.clear();
                }
            }
        }
    }

        private static void menu () {
            System.out.println("If you want to add deputy: press 1.");
            System.out.println("If you want to delete deputy: press 2.");
            System.out.println("Show the all bribe-takers in fraction: press 3.");
            System.out.println("Shoe the biggest bribe-taker in fraction: press 4.");
            System.out.println("Show the all deputies in fraction: press 5.");
            System.out.println("Clear the fraction: press 6.");
        }
    }



