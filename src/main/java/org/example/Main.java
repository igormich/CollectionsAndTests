package org.example;

import java.util.*;

public class Main {


    void manyFor() {
        List<Integer> list = List.of(1,2,3,4,5);
        for (var i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (var element : list) {
            System.out.println(element);
        }
        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {

        //Map<String, Integer> linkedMap = new LinkedHashMap<>();
        //Map<String, Integer> treeMap = new TreeMap<>();

        //Do not use! Не используй
        List<Float> linkedList = new LinkedList<>();
        //Use:
        var priorityQueue = new PriorityQueue<User>();
        priorityQueue.add(new User("mid-age", 33));
        priorityQueue.add(new User("teen", 16));
        priorityQueue.add(new User("very-old", 110));
        priorityQueue.add(new User("old", 80));
        priorityQueue.poll();
        System.out.println(priorityQueue);
    }

    static class User implements Comparable<User> {
        private String name;
        private int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(User other) {
            return Integer.compare(other.age, age);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}