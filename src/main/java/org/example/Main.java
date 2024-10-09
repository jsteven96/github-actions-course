package org.example;

public class Main {
    public static void main(String[] args) {
        String saludo = "Hello world!";
        if (args.length > 0) {
            saludo += args[0];
        }
        System.out.println(saludo);
    }
}