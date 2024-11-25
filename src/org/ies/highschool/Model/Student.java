package org.ies.highschool.Model;

import java.util.Objects;

public class Student {

    private String name;
    private String surmane;
    private String address;

    public Student(String name, String surmane, String address) {
        this.name = name;
        this.surmane = surmane;
        this.address = address;
    }

    public void showInfo(){

        System.out.println(name + " " + surmane + " " + address);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surmane, student.surmane) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surmane, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surmane='" + surmane + '\'' +
                ", address='" + address + '\'' +
                '}';
    }




}
