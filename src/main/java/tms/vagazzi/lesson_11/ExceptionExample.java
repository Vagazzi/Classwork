package tms.vagazzi.lesson_11;

public class ExceptionExample extends Throwable {

    private int age;
    public ExceptionExample(String message, int age) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
