package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3>7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        // Tabela verdade AND
        System.out.println("\n=== TABELA VERDADE AND===\n");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // Tabela verdade OR
        System.out.println("\n=== TABELA VERDADE OR===\n");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Tabela verdade XOR
        System.out.println("\n=== TABELA VERDADE XOR===\n");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Tabela verdade NOT
        System.out.println("\n=== TABELA VERDADE NOT===\n");
        System.out.println(!true);
        System.out.println(!false);
    }
}
