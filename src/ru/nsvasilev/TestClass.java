package ru.nsvasilev;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();
        double a = scanner.nextDouble();
        double s = scanner.nextDouble();
        int countOfTheGuysBeforeYour = scanner.nextInt();
        WomanWithNiceBoobs prilepskaya = new WomanWithNiceBoobs(f, a, s, countOfTheGuysBeforeYour, false);
        System.out.println(prilepskaya.getAge());
        System.out.println(prilepskaya.getSizeOfTheBoobs());
    }
}
