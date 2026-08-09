package oo.heranca.desafio;

public class Ferrari extends Carro {
    // acelera mais rápido (15 em 15)

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }
}
