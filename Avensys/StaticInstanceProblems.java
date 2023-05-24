package isolate1;

class Demo2 extends Object {
    static String static1, static2, static3;

    // Static variables
    static {
        static1 = "I am a static variable";
        static2 = "I am also a static variable";
        static3 = "I am the last static variable";
    }

    static void displayOne() {
        System.out.println(static1);
        System.out.println(static2);
        System.out.println(static3);
        System.out.println(insVar1);
        System.out.println(insVar2);
        System.out.println(insVar3);
    }

    // Instance variables
    String insVar1, insVar2, insVar3;
    {
        // Instance block
        insVar1 = "I am an instance variable";
        insVar2 = "I am also an instance variable";
        insVar3 = "I am the last instance variable";
    }

    void displayTwo() {
        System.out.println(static1);
        System.out.println(static2);
        System.out.println(static3);
        System.out.println(insVar1);
        System.out.println(insVar2);
        System.out.println(insVar3);
    }
}

public class StaticInstanceProblems {
    public static void main(String[] args) {
        System.out.println("Static method for displayOne:");
        Demo2.displayOne();

        System.out.println("\nInstance method for displayTwo:");
        Demo2 d = new Demo2();
        d.displayTwo();
    }
}
