package ejercicio8;

public class Main {

    public static void main(String[] args) {
        Reverse inverter = (str) -> {
            StringBuilder builder = new StringBuilder(str);
            return builder.reverse().toString();
        };

        String originalStr = "123456";
        String invertedStr = inverter.reverse(originalStr);

        System.out.println("Inverted string: " + invertedStr);
    }
}
