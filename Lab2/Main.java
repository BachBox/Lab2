package Lab2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentModel studentModel = new StudentModel();
        studentModel.inputStudents(sc);
        studentModel.printResult();
    }   
}
