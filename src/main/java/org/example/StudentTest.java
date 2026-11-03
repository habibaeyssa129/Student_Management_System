package org.example;

public class StudentTest {
    private Student[] students;

    public StudentTest(Student[] students) {
        this.students = students;
    }

    public void displayHighestTotal() {
        if (students == null || students.length == 0) {
            System.out.println("No students available.");
            return;
        }

        double maxTotal = students[0].getTotalDegree();
        for (Student s : students) {
            if (s != null && s.getTotalDegree() > maxTotal) {
                maxTotal = s.getTotalDegree();
            }
        }

        System.out.println("\n=== Student with Highest Total Degree (" + maxTotal + ") ===");
        for (Student s : students) {
            if (s != null && s.getTotalDegree() == maxTotal) {
                s.display();
            }
        }
    }

    public void displayGpaStudents() {
        if (students == null || students.length == 0) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n=== Students on Probation (GPA < 2 for 2 consecutive semesters) ===");
        boolean foundAny = false;

        for (Student s : students) {
            if (s == null) continue;
            double[] gpa = s.getGpa();
            boolean isOnProbation = false;

            for (int i = 0; i < gpa.length - 1; i++) {
                if (gpa[i] < 2.0 && gpa[i + 1] < 2.0) {
                    isOnProbation = true;
                    break;
                }
            }

            if (isOnProbation) {
                s.display();
                foundAny = true;
            }
        }

        if (!foundAny) {
            System.out.println("No students on probation.");
        }
    }
}

