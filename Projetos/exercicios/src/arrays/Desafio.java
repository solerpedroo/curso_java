package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // usuário informa a quantidade de notas que quer inserir
        // dois fors, um para coletar as notas e armazenar, o outro foreach para somar todas as nota
        // exibir a média do aluno

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas deseja inserir? ");
        int qtd = entrada.nextInt();


        double[] notas = new double[qtd];

        for (int i = 0; i<notas.length; i++){
            System.out.printf("\nDigite a %dª nota: ", i+1);
            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        for(double nota:notas){
            total+=nota;
        }

        System.out.printf("\nA média do aluno é: %.2f", (total/notas.length));

        entrada.close();
    }
}
