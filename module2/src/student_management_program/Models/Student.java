package student_management_program.Models;

public class Student extends Person {
    private String classroom;
    private Double score;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String gender, String classroom, Double score) {
        super(id, name, dateOfBirth, gender);
        this.classroom = classroom;
        this.score = score;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
    public String getInfo() {
        return getId() + "," + getName() + "," + getDateOfBirth() + "," + getGender() +","+getClassroom()+","+getScore();
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "classroom='" + classroom + '\'' +
                ", score=" + score +
                '}';
    }
}
