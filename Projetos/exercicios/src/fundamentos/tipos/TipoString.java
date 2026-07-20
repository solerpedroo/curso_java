package fundamentos.tipos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s+"!!!");
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde!"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Soler";
        var idade = 19;
        var salario = 1_000_000.01;

        System.out.printf("Nome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$ %.2f", nome, sobrenome, idade, salario);

        String frase = String.format("Nome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$ %.2f\n", nome, sobrenome, idade, salario);
        System.out.print(frase);

        String maisUmaFrase = "Frase qualquer";
        System.out.println(maisUmaFrase.contains("qual"));
        System.out.print(maisUmaFrase.indexOf("qual"));
        System.out.print(maisUmaFrase.substring(6));
        System.out.print(maisUmaFrase.substring(6,10));
    }
}
