package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunaA = new double[3];

        notasAlunaA[0] = 7.9;
        notasAlunaA[1] = 8;
        notasAlunaA[2] = 6.7;

        System.out.println((Arrays.toString(notasAlunaA)));

        double totalAlunoA = 0;
        for (int i =0; i<notasAlunaA.length; i++){
            totalAlunoA += notasAlunaA[i];
        }

        System.out.printf("Média aluno A: %.2f", totalAlunoA/notasAlunaA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunoB = 0;
        for (int i = 0; i<notasAlunoB.length; i++){
            totalAlunoB+=notasAlunoB[i];
        }
        System.out.printf("\nMédia aluno B: %.2f", totalAlunoB/notasAlunoB.length);
    }
}
