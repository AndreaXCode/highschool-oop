package org.ies.highschool;

import org.ies.highschool.Model.Student;
import org.ies.highschool.components.StudentReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentReader studentReader = new StudentReader(scanner);

        Student student = studentReader.read();


        student.showInfo();

    }
}
