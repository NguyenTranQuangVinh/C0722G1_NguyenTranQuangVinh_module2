package student_management_program.Utils;

import student_management_program.Models.Person;
import student_management_program.Models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileStudent {
    public static List<Student> readFile() throws IOException {
        File file = new File("src\\student_management_program\\Data\\student.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Student> studentList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine())!= null){
            String[] arr = line.split(",");
            Student student = new Student(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],Double.parseDouble(arr[5]));
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;
    }
    public static void writeFile(List<Student>list) throws IOException {
        File file = new File("src\\student_management_program\\Data\\student.csv");
        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student: list) {
            bufferedWriter.write(student.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
