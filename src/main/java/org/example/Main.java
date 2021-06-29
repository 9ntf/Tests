package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneContacts phoneContacts = new PhoneContacts();

        //цикл на добавление групп
        while (true) {
            System.out.println("Введите название группы или 'end':");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else if (!phoneContacts.isSameGroup(input)) {
                System.out.println("Такакя группа уже существует");
                continue;
            }
            phoneContacts.addGroup(input);
        }

        //цикл на добавление контактов
        while (true) {
            System.out.println("Введите название группы для добавления контакта или 'end':");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else if (phoneContacts.isSameGroup(input)) {
                System.out.println("Не найдена данная группа контактов");
                continue;
            }
            //цикл на добавление контактов в определенную группу
            while (true) {
                System.out.println("Введите имя контакта или 'end':");
                String name = scanner.nextLine();
                if ("end".equals(name)) {
                    break;
                }
                System.out.println("Введите фамилию контакта:");
                String surName = scanner.nextLine();
                System.out.println("Введите телефонный номер:");
                String phoneNumber = scanner.nextLine();
                phoneContacts.addContact(new Contact(name, surName, phoneNumber), new String[]{input});
            }
        }
        System.out.println(phoneContacts);
    }
}
