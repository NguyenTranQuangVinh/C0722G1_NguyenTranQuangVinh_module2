package student_management_program.Utils;

import student_management_program.Models.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Person> readFile() throws IOException {
        File file = new File("src\\student_management_program\\Data\\person.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Person> personList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine())!= null){
            String[] arr = line.split(",");
            Person person = new Person(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
            personList.add(person);
        }
        bufferedReader.close();
        return personList;
    }
    public static void writeFile(List<Person>list) throws IOException {
        File file = new File("src\\student_management_program\\Data\\person.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Person person: list) {
            bufferedWriter.write(person.getInfo());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
