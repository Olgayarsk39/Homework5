package ru.egorova.api.Homework5;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    String name;
    int number;
    String[] book;


    public PhoneBook(){ }


    public PhoneBook(String name, int number) {
        this.name = name;
        this.number = number;


    }


    @Override
    public String toString() {
        return name + " " + number;
    }

    public HashMap<String, ArrayList<Integer>> Record(String[] book) {
        for (String person : book) {
            String[] personParts = person.split(" ");
            name = personParts[0];
            number = Integer.parseInt(personParts[1]);
            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(number);
            } else {
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(number);
                phoneBook.put(name, lst);
            }
        }
        return phoneBook;
    }



    public void get(String name){
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name);
        }
        System.out.println("Найден " + name + " ->>>  " + phoneBook.get(name));
    }

    public void add (String name, int number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(number);
            phoneBook.put(name, lst);
        }
        System.out.println("Добавлены ->>>"+ phoneBook);
    }


}
