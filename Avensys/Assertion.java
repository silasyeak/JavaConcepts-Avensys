package isolate2;
public class Assertion {
    public static void main(String[] args) {
        int x = 0;
        assert (x > 0) : "assertion failed";
        System.out.println("finished");
    }
}