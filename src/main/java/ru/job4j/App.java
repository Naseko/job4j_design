package ru.job4j;

import ru.job4j.generics.Generics;
import ru.job4j.pojo.Animal;
import ru.job4j.pojo.Predator;
import ru.job4j.pojo.Tiger;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

            Generics gen = new Generics();
            List<Animal> first = new ArrayList<>();
            List<Predator> second = new ArrayList<>();
            List<Tiger> third = new ArrayList<>();
            first.add(new Animal());
            second.add(new Predator());
            third.add(new Tiger());

            gen.printObject(first);
            gen.printObject(second);
            gen.printObject(third);
            System.out.println();

            gen.printBoundedWildCard(first);
            gen.printBoundedWildCard(second);
            gen.printBoundedWildCard(third);
            System.out.println();

            gen.printLowerBoundedWildCard(first);
            gen.printLowerBoundedWildCard(second);
            gen.printLowerBoundedWildCard(third);
    }
}