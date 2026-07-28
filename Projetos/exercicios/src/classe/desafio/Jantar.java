package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 75.5);

        Comida c1 = new Comida("Salada", 0.2);
        Comida c2 = new Comida("Carne", 1.0);

        System.out.printf("Peso do %s antes de comer: %.2f kg\n", p1.nome, p1.peso);
        p1.comer(c2);
        System.out.printf("Peso do %s depois de comer: %.2f kg\n", p1.nome, p1.peso);
    }
}
