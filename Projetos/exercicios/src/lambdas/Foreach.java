package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // foreach tradicional
        System.out.println("Foreach tradidiconal");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #001");
        aprovados.forEach(nome -> System.out.println(nome + "!!!")); // um único parâmetro não precisa de parênteses
        // uma única linha de código não precisa de chaves

        System.out.println("\nMethod Reference #01");
        aprovados.forEach(System.out::println); // está passando um metodo, menos código, mesma funcionalidade do anterior

        System.out.println("\nLambda #02");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(Foreach::meuImprimir);
    }
    static void meuImprimir(String nome){
        System.out.println("Olá, meu nome é " + nome);
    }
}
