package fundamentos;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class DesafioCalculadora {
    // Ler num1
    // Ler num2
    // Usuário digitar a operação + - * / %

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");

        System.out.println("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        System.out.println("\nOPERAÇÕES:");
        System.out.println("+. Adição");
        System.out.println("-. Subtração");
        System.out.println("*. Multiplicação");
        System.out.println("/. Divisão");
        System.out.println("%. Módulo");

        System.out.println("\nDigite apenas o ícone da operação: ");
        entrada.nextLine();
        String op = entrada.nextLine();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1-n2 : resultado;
        resultado = "*".equals(op) ? n1*n2 : resultado;
        resultado = "/".equals(op) ? n1/n2 : resultado;
        resultado = "%".equals(op) ? n1%n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);

        entrada.close();
    }

}
