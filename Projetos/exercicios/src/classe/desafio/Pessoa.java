package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    double comer(Comida c){
        if (c!= null) return peso += c.peso;
        return 0;
    }

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
}
