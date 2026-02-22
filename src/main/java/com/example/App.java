package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Simple Java App!");

        if (args.length == 0) {
            System.out.println("No integer args provided. Usage: java com.example.App 1 2 3");
            return;
        }

        int sum = 0;
        for (String a : args) {
            try {
                sum += Integer.parseInt(a);
            } catch (NumberFormatException e) {
                System.out.printf("Skipping non-integer arg: %s%n", a);
            }
        }

        System.out.println("Sum of integer args: " + sum);
    }
}
