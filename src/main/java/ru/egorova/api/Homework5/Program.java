package ru.egorova.api.Homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {

        String[] book = { "Иванов 123456" };

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.Record(book);
        phoneBook.add("Григорьев", 123);
        phoneBook.add("Иванов", 5);
        phoneBook.add("Сидоров", 13);
        phoneBook.add("Иванов", 3);
        phoneBook.get("Иванов");

    }

}