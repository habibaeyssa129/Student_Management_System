package org.example;


public class Student {
    private static int count = 0;
    private int rollNo;
    private String name;
    private Date birthDate;
    private final double max = 100.0;
    private double[] degree = new double[3];
    private double[] gpa = new double[5];

    public Student(String name, Date birthDate, double[] degree, double[] gpa) {
        count++;
        this.rollNo = count; // Auto assign rollNo
        this.name = name;
        this.birthDate = birthDate;
        setDegree(degree);
        setGpa(gpa);
    }

    public void setDegree(double[] degree) {
        if (degree != null && degree.length <= 3) {
            for (int i = 0; i < 3; i++) {
                if (degree[i] >= 0 && degree[i] <= max) {
                    this.degree[i] = degree[i];
                } else {
                    System.out.println("sorry your subject is invalid");
                    this.degree[i] = 0;
                }
            }
        }
    }

    public void setGpa(double[] gpa) {
        this.gpa = gpa;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public Date getBirthDate() { return birthDate; }
    public double[] getDegree() { return degree; }
    public double[] getGpa() { return gpa; }

    public double getTotalDegree() {
        double total = 0;
        for (int i = 0; i < degree.length; i++) {
            total += degree[i];
        }
        return total;
    }


    public String calculateGrade() {
        double averagePercentage = (getTotalDegree() / (3 * max)) * 100;
        if (averagePercentage >= 85) return "A";
        else if (averagePercentage >= 75) return "B";
        else if (averagePercentage >= 65) return "C";
        else if (averagePercentage >= 50) return "D";
        else return "F";
    }


    public void display() {
        System.out.println("the rollNo:  " + getRollNo());
        System.out.println("the name:  " + getName());
        System.out.println("the birth date:  " + getBirthDate());

        System.out.print("Degrees (out of " + max + "): ");
        for (double d : degree) {
            System.out.print(d + ",");
        }
        System.out.println();

        System.out.print("5 Semesters CGPAs: ");
        for (double c : gpa) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Overall Grade: " + calculateGrade());
        System.out.println("----------------------------------------");
    }
}
