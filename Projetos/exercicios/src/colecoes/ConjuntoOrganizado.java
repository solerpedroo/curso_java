package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        // Set<String > listaAprovados = new HashSet<>(); // desse lado pode ter ou não o identificador de tipo ou apenas o <>
        TreeSet<String > listaAprovados = new TreeSet<>(); // ordem de inserção usa-se o TreeSet
        listaAprovados.add("Pedro");
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");

        for (String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums){
            System.out.println(n);
        }
    }
}
