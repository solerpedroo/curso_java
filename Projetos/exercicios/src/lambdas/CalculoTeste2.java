package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calculo = (x, y) -> {return x+y;}; // maneira 1 de fazer lambda, nesse caso aqui pode ter quebra de linha também
        System.out.println(calculo.executar(2,3));

        calculo = (x, y) -> x*y; // maneira 2 de fazer lambda
        System.out.println(calculo.executar(2,3));

        // lambdas são parecidas com as arrow functions do java script, mesma metodologia e afins
    }
}