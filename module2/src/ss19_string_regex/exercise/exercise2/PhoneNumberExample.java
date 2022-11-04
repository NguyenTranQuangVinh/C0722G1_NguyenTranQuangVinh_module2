package ss19_string_regex.exercise.exercise2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER = "^[(]\\d\\d[)]-[(]0\\d{9}[)]$$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
