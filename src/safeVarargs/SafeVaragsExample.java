package safeVarargs;

public class SafeVaragsExample {
    @SafeVarargs //제네릭 가변인자에 대한 기능을 무시하는 기능
    public static <T> void printMessage(T... message) {
        for (T m : message) {
            System.out.println(message);
        }
    }
}
