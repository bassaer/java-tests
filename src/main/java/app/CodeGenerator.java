package app;

public class CodeGenerator {
    public static String generate(String input) {
        switch (input.length()) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
        }
        return "D";
    }
}
