package student_management_program.Services;

import java.io.IOException;

public interface IStudentServices {
    void addStudent() throws IOException;

    void deleteStudent() throws IOException;

    void displayStudent() throws IOException;
}
