package org.example;

import java.util.*;

public class Contact {
    private final String name;
    private final String surName;
    private String number;

    public Contact(String name, String surName, String number) {
        this.name = name;
        this.surName = surName;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " " + surName + ", Номер телефона:" + number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(this.getClass())) return false;
        Contact contact = (Contact) obj;
        return (this.name.equals(contact.name) && this.surName.equals(contact.surName));
    }
}
