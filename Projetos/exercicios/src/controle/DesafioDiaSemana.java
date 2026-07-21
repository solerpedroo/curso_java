package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> 1
        // Quarta -> 4

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.next().toUpperCase();

        if ("DOMINGO".equals(dia)){
            System.out.println(dia + " -> 1");
        } else if ("SEGUNDA-FEIRA".equals(dia)){
            System.out.println(dia + " -> 2");
        } else if ("TERÇA-FEIRA".equals(dia) || "TERCA-FEIRA".equals(dia)){
            System.out.println(dia + " -> 3");
        } else if ("QUARTA-FEIRA".equals(dia)){
            System.out.println(dia + " -> 4");
        } else if ("QUINTA-FEIRA".equals(dia)){
            System.out.println(dia + " -> 5");
        } else if ("SEXTA-FEIRA".equals(dia)){
            System.out.println(dia + " -> 6");
        } else if ("SÁBADO".equals(dia) || "SABADO".equals(dia)){
            System.out.println(dia + " -> 7");
        } else{
            System.out.println("Dia informado não existe");
        }
    }
}
