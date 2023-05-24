package tms.vagazzi.lesson_16;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixteenthClasswork {
    public static void main(String[] args) {
//        String testString  = "This is my 1st string, - 12345";
//        Pattern number = Pattern.compile("\\d+[1-9]");
//        Matcher matcher = number.matcher(testString);
//        System.out.println(matcher.matches());


        List<String> testValues = Arrays.asList("ABC", "abc", "f", "F", "", "a1a", "a11", "");

        //Pattern pattern = Pattern.compile("[a-z]");
        //Pattern pattern = Pattern.compile("[a-z]+");
        //Pattern pattern = Pattern.compile("[a-z]*");
        //Pattern pattern = Pattern.compile("[a-z]?");
        //Pattern pattern = Pattern.compile("[a-z]{2,3}");
        //Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        //Pattern pattern = Pattern.compile("[^a-z]+", Pattern.CASE_INSENSITIVE);

        Pattern pattern = Pattern.compile("[a-z]+\\d+$");
        testValues.forEach(str -> {
            Matcher anotherMatcher = pattern.matcher(str);
            System.out.println(str + " matches? " + anotherMatcher.matches());
        });
    }
}
