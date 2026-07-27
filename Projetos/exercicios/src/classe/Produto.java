package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    // construtor default
    Produto(){

    }

    // construtor explícito
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    // é possível ter métodos com nomes iguais porém com parâmetros diferentes
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - (desconto + descontoDoGerente));
    }
}
