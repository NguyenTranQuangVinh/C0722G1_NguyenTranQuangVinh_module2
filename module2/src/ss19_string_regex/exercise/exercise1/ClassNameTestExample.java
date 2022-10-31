package ss19_string_regex.exercise.exercise1;

public class ClassNameTestExample {
    public static final String[] validClassName = new String[]{"C0822G", "C0318G"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
    }
}
