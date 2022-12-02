package student_management_program.Views;

import student_management_program.Controllers.PersonManagementControllers;

import java.io.IOException;

public class Views {
    public static void main(String[] args) {
        PersonManagementControllers personManagementControllers = new PersonManagementControllers();
        try {
            personManagementControllers.menuCodeGym();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

