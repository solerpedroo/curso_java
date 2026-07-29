package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtd = entrada.nextInt();

        System.out.print("\nQuantas notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtd][qtdNotas];

        double total = 0;
        for (int i = 0; i<notasDaTurma.length; i++){
            for (int j = 0; j<notasDaTurma[i].length; j++){
                System.out.printf("\nInforme a nota %d do aluno %d: ", j+1, i+1);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        System.out.printf("\nA média da turma é: %.2f", total/(qtd*qtdNotas));
    }
}
