package student_management_program.Controllers;

import student_management_program.Services.ITeacherServices;
import student_management_program.Services.Impl.TeacherImpl;

import java.io.IOException;
import java.util.Scanner;

public class TeacherManagementProgramControllers {
    public void menuTeacher() throws IOException {
        ITeacherServices iTeacherServices = new TeacherImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên \n" +
                    "3. Xem danh sách giảng viên \n" +
                    "4. Thoát\n");
            System.out.println("Vui lòng chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherServices.addTeacher();
                    break;
                case 2:
                    iTeacherServices.deleteTeacher();
                    break;
                case 3:
                    iTeacherServices.displayTeacher();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
