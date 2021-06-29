package org.example;

import java.util.*;

public class PhoneContacts {
    private Map<String, ArrayList<Object>> phoneBook = new HashMap<>();

    public boolean addGroup(String group) {
        if (!phoneBook.containsKey(group)) {
            phoneBook.put(group, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addContact(Contact contact, String[] groups) {
        for (String group : groups) {
            if (!phoneBook.get(group).contains(contact)) {
                phoneBook.get(group).add(contact);
                return true;
            }
        }
        return false;
    }

    public boolean isSameGroup(String groups) {
        for (Map.Entry<String, ArrayList<Object>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(groups)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Телефонная книга\n\n");
        for (Map.Entry<String, ArrayList<Object>> entry : phoneBook.entrySet()) {
            String group = entry.getKey();
            List<Object> contacts = entry.getValue();
            stringBuilder.append(group + ":\n");
            if (contacts.isEmpty()) {
                stringBuilder.append("\tНет контактов\n");
            } else {
                for (Object contact : contacts) {
                    stringBuilder.append("\tКонтакт: " + contact + "\n");
                }
            }
        }
        return stringBuilder.toString();
    }
}
