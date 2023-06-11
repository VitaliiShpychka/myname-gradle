package org.example;

public class Human {private String name;
    private String lastName;

    public Human (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }
}
