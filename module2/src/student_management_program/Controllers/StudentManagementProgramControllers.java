package student_management_program.Controllers;

import student_management_program.Services.IStudentServices;
import student_management_program.Services.Impl.StudentImpl;

import java.io.IOException;
import java.util.Scanner;

public class StudentManagementProgramControllers {
    public void menuStudent() throws IOException {
        IStudentServices iStudentServices = new StudentImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm mới học sinh\n" +
                    "2. Xóa học sinh\n" +
                    "3. Xem danh sách học sinh\n" +
                    "4. Thoát\n");
            System.out.println("Vui lòng chọn chức năng.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentServices.addStudent();
                    break;
                case 2:
                    iStudentServices.deleteStudent();
                    break;
                case 3:
                    iStudentServices.displayStudent();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }

}
