package ru.job4j.generics;

import ru.job4j.pojo.Animal;
import ru.job4j.pojo.Tiger;

import java.util.Iterator;
import java.util.List;

public class Generics {


    public void printObject(List<?> list) {
        for (Iterator<?> it = list.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printBoundedWildCard(List<? extends Animal> list) {
        for (Iterator<? extends Animal> it = list.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printLowerBoundedWildCard(List<? super Tiger> list) {
        for (Iterator<? super Tiger> it = list.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println("Текущий элемент: " + next);
        }
    }
}