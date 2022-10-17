package ss10_list.exercise.exercise2;

public class Test {
    public static void main(String[] args) {
        class Student {
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Vinh");
        Student student2 = new Student(2, "Linh");
        Student student3 = new Student(3, "Vy");
        Student student4 = new Student(4, "Thuy");
        Student student5 = new Student(5, "Nha");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);

        System.out.println(myLinkedList.indexOf(student3));
    }
}
