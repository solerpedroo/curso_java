package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    // construtor default
    Produto(){

    }

    // construtor explícito
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    // é possível ter métodos com nomes iguais porém com parâmetros diferentes
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - (desconto + descontoDoGerente));
    }
}
