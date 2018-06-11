package com.company;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String lastname;

    public Person(String name) {
        this.name = name;
        this.lastname = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getLastname(), person.getLastname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getLastname());
    }
}
