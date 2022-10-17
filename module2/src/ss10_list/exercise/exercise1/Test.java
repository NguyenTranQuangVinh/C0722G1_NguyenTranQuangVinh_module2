package ss10_list.exercise.exercise1;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Vinh");
        Student b = new Student(2, "Thắng");
        Student c = new Student(3, "Tuấn");
        Student d = new Student(4, "Huy");
        Student e = new Student(5, "Minh");
        Student f = new Student(6, "Định");
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.add(f,2);
        studentMyList.size();
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
        newMyList = studentMyList.clone();
        Student student = newMyList.remove(0);
        System.out.println(student.getName());
    }
}
