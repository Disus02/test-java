package ru.sapteh;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Mikhail", 19, 2001);
        Person person1 = new Person("Alexey", 32, 1987);
        Person person2 = new Person("Maxim", 12, 2008);
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }
}
