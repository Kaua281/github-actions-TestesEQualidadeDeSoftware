package src;

public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        }

        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(multiplicar(2, 2));
    }
}