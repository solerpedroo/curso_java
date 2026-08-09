package oo.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Classic classic = new Classic();
        Carro civic = new Carro(400);

        ferrari.velocidadeAtual = 130;
        classic.velocidadeAtual = 50;
        civic.velocidadeAtual = 100;

        System.out.println("A velocidade atual da Ferrari é: " + ferrari.velocidadeAtual);
        System.out.println("A velocidade atual do Classic é: " + classic.velocidadeAtual);
        System.out.println("A velocidade atual do Civic é: " + civic.velocidadeAtual);

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("A velocidade atual da Ferrari é: " + ferrari.velocidadeAtual);

        civic.acelerar();
        civic.acelerar();
        System.out.println("A velocidade atual do Civic é: " + civic.velocidadeAtual);

        classic.freiar();
        classic.freiar();
        classic.freiar();
        classic.freiar();
        classic.freiar();
        System.out.println("A velocidade atual do Classic é: " + classic.velocidadeAtual);

        classic.freiar();
        System.out.println("A velocidade atual do Classic é: " + classic.velocidadeAtual);
    }
}
