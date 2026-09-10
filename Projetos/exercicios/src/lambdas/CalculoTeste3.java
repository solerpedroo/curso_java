package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // java não permite int -> Double

        BinaryOperator<Double> calculo = (x, y) -> {return x+y;}; // maneira 1 de fazer lambda, nesse caso aqui pode ter quebra de linha também
        System.out.println(calculo.apply(2.0,3.0));

        calculo = (x, y) -> x*y; // maneira 2 de fazer lambda
        System.out.println(calculo.apply(2.0,3.0));

        // lambdas são parecidas com as arrow functions do java script, mesma metodologia e afins

        BinaryOperator<Integer> calculo2 = (x, y) -> {return x+y;};
        System.out.println(calculo2.apply(50,30));
    }
}