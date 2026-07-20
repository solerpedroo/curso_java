package fundamentos.tipos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        double d; // declaração
        d = 123.456; // inicialização
        System.out.println(d);

        // Para declarar var deve-se inicializar logo em seguida, pois o compilador do java não entende se inicializar na linha seguinte, ex:
        // var e;
        // e = 123; -> ERRADO, o correto é: var e = 123;
        // uma vez utilizado var para declarar um tipo para o java inferir (ex: 12), não é possível declarar a variável depois como
        // 12.01 por exemplo, pois o java vai estar esperando um inteiro
        // java é uma linguagem que os tipos são fortes
    }
}
