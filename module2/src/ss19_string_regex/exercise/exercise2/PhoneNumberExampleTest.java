package ss19_string_regex.exercise.exercise2;

public class PhoneNumberExampleTest {
    public static final String[] validPhoneNumber = new String[]{"(84)-0978489648", "(84)-0978489649","(a8)-22222222"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }

    }
}
