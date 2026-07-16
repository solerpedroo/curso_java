package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        //(ºF - 32) x 5/9 = ºC
        final int v1 = 32;
        final double v2 = 5.0/9.0;

        double f = 90;
        double resultado = (f-v1)*v2;
        System.out.printf("A temperatura %.2fºF é igual a %.2fºC\n", f, resultado);

    }
}
