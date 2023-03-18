package ejercicio5;

public class Main {

    interface MetodoPi{
        public double getPiValue();
    }

    public static void main(String[] args){

        MetodoPi pi= () -> 3.1415;
        System.out.println(pi.getPiValue());
    }

}
