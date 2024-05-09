package ru.liga.dcs.lesson09;

import java.util.Arrays;
import java.util.List;

public class Main {

    static class Group {
        private final List<Person> people;

        public Group(List<Person> people) {
            this.people = people;
        }

        public List<Person> people() {
            return people;
        }
    }

    static class Person {
        private final String name;
        private final Long age;

        public Person(String name, Long age) {
            this.name = name;
            this.age = age;
        }

        public String name() {
            return name;
        }

        public Long age() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Group group1 = new Group(Arrays.asList(
                new Person("Вова", 16L),
                new Person("Никита", 18L),
                new Person("Лёша", 22L)));

        Group group2 = new Group(Arrays.asList(
                new Person("Саша", 14L),
                new Person("Аня", 20L),
                new Person("Дима", 60L)));

        throw new UnsupportedOperationException("Implemented it!");
    }

    /**
     * Возвращает всех людей старше 18 лет.
     *
     * @param persons список групп людей
     * @return список людей старше 18 лет
     */
    public static List<Person> adultPersons(List<Group> persons) {
        throw new UnsupportedOperationException("Implemented it!");
    }
}
