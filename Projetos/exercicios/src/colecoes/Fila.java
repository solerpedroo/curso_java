package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // offer e adicionar -> adicionam elementos na fila
        // diferença é o comportamento quando a fila está cheia
        fila.add("Ana"); // retorna falso
        fila.offer("Bia"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Pedro");
        fila.offer("Rafaela");

        // obtem o próximo elemento da fila sem remover
        System.out.println(fila.peek()); // retorna null quando fila vazia
        System.out.println(fila.element()); // retorna erro quando fila vazia

        // fila.clear();
        // fila.isEmpety();
        // fila.size();

        // obtem o proximo elemento da fila e remove
        System.out.println(fila.remove()); // lança um erro
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.clear();
        // fila.isEmpety();
        // fila.size();
        // fila.contains();
    }
}
