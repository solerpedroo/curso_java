package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno príncipe"); // retorna um boolean
        livros.push("Don Quixote");
        livros.push("O Hobbit"); // lança uma exceção caso tamanho já alcançado

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for(String livro: livros){
            System.out.println(livro);
        }

        System.out.println(livros.pop()); // joga uma exceção
        System.out.println(livros.poll()); // retorna null
        System.out.println(livros.poll());
        System.out.println(livros.remove()); // joga exceção

        // livros.size();
        // livros.clear();
        // livros.contains();
    }
}
