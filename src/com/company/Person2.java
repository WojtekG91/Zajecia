package com.company;

import java.util.Objects;

public class Person2 implements Test1, Test2 {
    private String name;
    private String surname;
    private int age;

    public Person2(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person2)) return false;
        Person2 person2 = (Person2) o;
        return getAge() == person2.getAge() &&
                Objects.equals(getName(), person2.getName()) &&
                Objects.equals(getSurname(), person2.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getAge());
    }

    @Override
    public void sprawdzam() {

    }
}
