package student_management_program.Controllers;

import java.io.IOException;
import java.util.Scanner;

public class PersonManagementControllers {

public void menuCodeGym() throws IOException {
    Scanner scanner = new Scanner(System.in);
    StudentManagementProgramControllers studentManagementProgramControllers =new StudentManagementProgramControllers();
    TeacherManagementProgramControllers teacherManagementProgramControllers = new TeacherManagementProgramControllers();

    int choice;
    do {
        System.out.println("1.\tStudent Management Program\n"+
                "2.\tTeacher Management Program\n"+
                "3.\tExit\n"+
                "\n");
        System.out.println("Mời bạn nhập chức năng");
        choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                studentManagementProgramControllers.menuStudent();
                break;
            case 2:
                teacherManagementProgramControllers.menuTeacher();
                break;
            case 3:
                System.exit(0);
        }
    }while (true);

}
}
