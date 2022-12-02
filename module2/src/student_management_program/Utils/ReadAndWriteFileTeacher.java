package student_management_program.Utils;



import student_management_program.Models.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileTeacher {
    public static List<Teacher> readFile() throws IOException {
        File file = new File("src\\student_management_program\\Data\\teacher.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Teacher> teacherList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine())!= null){
            String[] arr = line.split(",");
            Teacher teacher = new Teacher(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4]);
            teacherList.add(teacher);
        }
        bufferedReader.close();
        return teacherList;
    }
    public static void writeFile(List<Teacher>list) throws IOException {
        File file = new File("src\\student_management_program\\Data\\teacher.csv");
        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Teacher teacher: list) {
            bufferedWriter.write(teacher.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
