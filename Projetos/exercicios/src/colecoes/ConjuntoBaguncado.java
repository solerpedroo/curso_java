package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> charactere

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("teste");
        conjunto.add('x');
        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.remove("Teste");
        conjunto.remove("abc");
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // união entre dois conjuntos
        conjunto.retainAll(nums); // ver o que tem em comum entre os conjuntos
        conjunto.clear(); // limpar o conjunto
        System.out.println(conjunto);

    }
}
