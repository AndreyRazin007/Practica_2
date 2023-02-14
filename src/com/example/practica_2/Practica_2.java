package com.example.practica_2;

import java.util.ArrayList;
import java.util.Random;

public class Practica_2 {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        splitList(source, positive, negative);

        for (int number : source) {
            System.out.println(number);
        }

        System.out.println("\n\n\nAll positive values:\n\n\n");
        for (int number : positive) {
            System.out.println(number);
        }

        System.out.println("\n\n\nAll negative values:\n\n\n");
        for (int number : negative) {
            System.out.println(number);
        }
    }

    public static void splitList(ArrayList<Integer> source, ArrayList<Integer> positive, ArrayList<Integer> negative) {
        Random random = new Random();

        for (int i = 0; i < 100; ++i) {
            source.add(random.nextInt(-100, 100));
        }

        for (int number : source) {
            if (number < 0) negative.add(number);
            else if (number > 0) positive.add(number);
        }
    }
}
