package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        /*
         * a partir do scanner pegar 3 strings usando nextline, receber ultimos 3 salarios e calcular a media dos salarios
         * usuário pode dividir por vírgula ou por ponto
         * */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1º salário: ");
        String salario1 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite o 2º salário: ");
        String salario2 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite o 3º salário: ");
        String salario3 = entrada.nextLine().replace(",", ".");

        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);

        System.out.printf("A média dos três salários é R$: %.2f", (numero1+numero2+numero3)/3);

        entrada.close();
    }

}
