package student_management_program.Services.Impl;

import student_management_program.Models.Student;
import student_management_program.Services.IStudentServices;
import student_management_program.Utils.ReadAndWriteFileStudent;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements IStudentServices {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addStudent() throws IOException {
            List<Student> students = ReadAndWriteFileStudent.readFile();
            Student student = new Student();
            System.out.println("Vui lòng điền thông tin sau:");
            System.out.println("Nhập mã học sinh: ");
            student.setId(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập tên học sinh: ");
            student.setName(scanner.nextLine());
            System.out.println("Nhập ngày sinh học sinh: ");
            student.setDateOfBirth(scanner.nextLine());
            System.out.println("Nhập giới tính học sinh: ");
            student.setGender(scanner.nextLine());
            System.out.println("Nhập lớp học sinh: ");
            student.setClassroom(scanner.nextLine());
            System.out.println("Nhập điểm học sinh: ");
            student.setScore(Double.parseDouble(scanner.nextLine()));
            students.add(student);
            ReadAndWriteFileStudent.writeFile(students);
    }

    @Override
    public void deleteStudent() throws IOException {
        List<Student>students = ReadAndWriteFileStudent.readFile();
        System.out.println("Nhập mã học sinh muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Đã xóa thành công: ");
                ReadAndWriteFileStudent.writeFile(students);
            }
        }
        System.out.println("Không tìm thấy mã học sinh cần xóa.");

    }

    @Override
    public void displayStudent() throws IOException {
        List<Student>students = ReadAndWriteFileStudent.readFile();
        for (Student student : students) {
            System.out.println(student);
        }
        ReadAndWriteFileStudent.writeFile(students);
    }
}
