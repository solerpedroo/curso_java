package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei tudo");
            case "marrom":
                System.out.println("Sei quase tudo");
            case "roxa":
                System.out.println("Sei legal");
            case "verde":
                System.out.println("Sei intermediário");
            case "laranja":
                System.out.println("Sei legalzinho");
            case "vermelha":
                System.out.println("Sei ok");
            case "amarela":
                System.out.println("Sou iniciante");
            default:
                System.out.println("Sei de nada");
        }
    }
}
