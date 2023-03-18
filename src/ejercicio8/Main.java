package ejercicio8;

public class Main {

    interface StringInverter {
        public String invert(String str);
    }

    public static void main(String[] args){

        StringInverter inverter = (str) -> {
            StringBuilder builder = new StringBuilder(str);
            return builder.reverse().toString();
        };

        String originalStr = "123456";
        String invertedStr = inverter.invert(originalStr);

        System.out.println("Inverted string: " + invertedStr);
    }
}
