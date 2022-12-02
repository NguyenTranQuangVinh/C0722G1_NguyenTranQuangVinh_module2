package student_management_program.Services.Impl;

import student_management_program.Models.Teacher;
import student_management_program.Services.ITeacherServices;
import student_management_program.Utils.ReadAndWriteFileTeacher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TeacherImpl implements ITeacherServices {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addTeacher() throws IOException {
        List<Teacher> teachers = ReadAndWriteFileTeacher.readFile();
        Teacher teacher = new Teacher();
        System.out.println("Vui lòng điền thông tin sau: ");
        System.out.println("Nhập mã giảng viên: ");
        teacher.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên giảng viên: ");
        teacher.setName(scanner.nextLine());
        System.out.println("Nhập ngày sinh giảng viên: ");
        teacher.setDateOfBirth(scanner.nextLine());
        System.out.println("Nhập giới tính giảng viên: ");
        teacher.setGender(scanner.nextLine());
        System.out.println("Nhập chuyên môn giảng viên: ");
        teacher.setSpecialize(scanner.nextLine());
        teachers.add(teacher);
        ReadAndWriteFileTeacher.writeFile(teachers);
    }

    @Override
    public void deleteTeacher() throws IOException {
List<Teacher> teachers = ReadAndWriteFileTeacher.readFile();
        System.out.println("Nhập id bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Teacher teacher : teachers) {
            if (teacher.getId()==id){
                teachers.remove(teacher);
                System.out.println("Đã xóa thành công.");
                ReadAndWriteFileTeacher.writeFile(teachers);
                return;
            }
        }
        System.out.println("Không tìm thấy id giảng viên cần xóa.");
    }

    @Override
    public void displayTeacher() throws IOException {
List<Teacher>teachers = ReadAndWriteFileTeacher.readFile();
        for (Teacher teacher :teachers) {
            System.out.println(teacher);
        }
        ReadAndWriteFileTeacher.writeFile(teachers);
    }
}
