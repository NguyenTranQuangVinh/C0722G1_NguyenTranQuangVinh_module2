import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    //    Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
//    Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.
//    Hãy viết chương trình sửa lại xâu kí tự đó theo yêu cầu sau:
//    Tách các từ, và thêm 1 kí tự cách (space) giữa 2 từ liên tiếp
//    Chuyển đổi các kí tự in hoa thành kí tự in thường
//    Ví dụ:
//    Với s = "CodegymDaNang", thì kết quả amendTheSentence(s) = "codegym da nang"
//    Với s = "Hello", thì kết quả amendTheSentence(s) = "hello"
//    public static void main(String[] args) {
//        String string = "Hello";
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < string.length(); i++) {
//            char c = string.charAt(i);
//            if (Character.isUpperCase(c)) {
//                stringBuilder.append(' ');
//                c = Character.toLowerCase(c);
//            }
//            stringBuilder.append(c);
//        }
//        string =stringBuilder.toString().trim();
//        System.out.println(string);
//    }
//    public static void main(String[] args) {
//        System.out.println(insertSpace("Hello"));
//    }
//
//    public static String insertSpace(String s) {
//        String upperCaseRegex = "[A-Z]";
//        String lowerCaseRegex = "[a-z]";
//        String str = "";
//        String[] strings = s.split("");
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].matches(upperCaseRegex)) {
//                String word = strings[i];
//                for (int j = i + 1; j < strings.length; j++) {
//                    if (strings[j].matches(lowerCaseRegex)) {
//                        word += strings[j];
//                    } else {
//                        break;
//                    }
//                }
//                str += word;
//                str += " ";
//            }
//        }
//        return str.toLowerCase();
//
//    }
    public static void main(String[] args) {
        String input = "CodegymDaNang";
        String temp = "";
        String[] strings = input.split("");
        for (int i = 0; i < input.length(); i++) {
            if (strings[i].matches(input)) {
                String word = strings[i];
                for (int j = i + 1; j < input.length(); j++) {
                    if (strings[j].matches(input)) {
                        word += strings[j];
                    } else {
                        break;
                    }
                }
                temp += word;
                temp += "";
            }
        }
        System.out.println(temp.toLowerCase());
    }
}


