package Lab2;

import java.util.*;

import Interface.MyUltil;

public class StudentModel {
    List<Student> students = new ArrayList<>();

    public void inputStudents(Scanner sc) {
        while (true) {
            System.out.println("Input id: ");
            int id = MyUtil.getAnInteger();
            System.out.println("Input name: ");
            String name = sc.nextLine();
            System.out.println("Input math score: ");
            double mathScore = MyUtil.getADouble();
            System.out.println("Input physic score: ");
            double physicScore = MyUtil.getADouble();
            System.out.println("Input chemistry score: ");
            double chemistryScore = MyUtil.getADouble();
            double averageScore = (mathScore + physicScore + chemistryScore) / 3;
            char classify;
            if (averageScore >= 8)
                classify = 'A';
            else if (averageScore < 8 && averageScore >= 6.5)
                classify = 'B';
            else
                classify = 'C';
            Student student = new Student(name, averageScore, classify);
            students.add(student);
            System.out.println(student);
            System.out.println("Do u wanna input new student? Press 1 to continue: ");
            int choice = MyUltil.getAnInteger();
            if (choice != 1) {
                return;
            }
        }
    }

    public void printResult() {
        int AStudents = 0, BStudents = 0, CStudents = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getClassify() == 'A')
                AStudents++;
            else if (students.get(i).getClassify() == 'B')
                BStudents++;
            else
                CStudents++;
        }
        System.out.println("Percentage of A Students is: " + (AStudents / students.size())*100.00+ "%");
        System.out.println("Percentage of B Students is: " + (BStudents / students.size())*100.00+ "%");
        System.out.println("Percentage of C Students is: " + (CStudents / students.size())*100.00+ "%");
    }
}
