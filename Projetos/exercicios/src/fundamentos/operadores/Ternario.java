package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultadoFianl = media >= 7 ? "Aprovado" : resultadoParcial;

        System.out.printf("O aluno está %s", resultadoFianl);
    }
}
