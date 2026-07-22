package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // calcular média das notas de uma turma, pode ter N alunos, usuário vai digitar uma nota válida
        // quando usuário digitar nota válida armazena
        // calcula a média
        // digitou -1 sai do programa

        int qtd_notas = 0;
        double total = 0;
        double nota = 0;

        Scanner entrada = new Scanner(System.in);

        while(nota != -1){
            System.out.print("Digite a nota: ");
            nota = entrada.nextDouble();

            if (nota == -1){
                System.out.println("Saindo...");
            } else if (nota < 0 || nota > 10){
                System.out.println("Digite uma nota válida");
            } else{
                qtd_notas++;
                total += nota;
            }
        }

        System.out.printf("A quatidade total de notas é: %d\n", qtd_notas);
        System.out.printf("A média da turma é: %.2f", total/qtd_notas);

        entrada.close();
    }
}
