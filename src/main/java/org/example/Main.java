package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        Student[] studentList = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("---------");
            System.out.println("Entering details for Student " + (i + 1) + ":");

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine(); // قراءة الاسم بشكل صحيح

            // Date input
            System.out.println("Enter Birth Date (Day Month Year): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            Date birthDate = new Date(day, month, year);

            // Subject degrees input
            double[] degrees = new double[3];
            System.out.println("Enter degrees for 3 subjects (0 - 100):");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                degrees[j] = scanner.nextDouble();
            }

            // CGPA input
            double[] gpas = new double[5];
            System.out.println("Enter GPA for 5 semesters:");
            for (int k = 0; k < 5; k++) {
                System.out.print("Semester " + (k + 1) + ": ");
                gpas[k] = scanner.nextDouble();
            }
            scanner.nextLine();

            studentList[i] = new Student(name, birthDate, degrees, gpas);
        }

        // Run StudentTest verification methods
        StudentTest testSystem = new StudentTest(studentList);

        System.out.println("\n================ RESULTS ================");
        testSystem.displayHighestTotal();
        testSystem.displayGpaStudents();

        scanner.close();
    }
}