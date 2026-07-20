package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        /*
        * Trabalho na terça (v ou f)
        * Trabalho na quinta (v ou f)
        * se os dois trabalhos derem certo, irá comprar uma televisão de 50 polegadas
        * se um der certo comprará uma televisão de 32 polegadas
        * comprando qualquer uma televisão, irá tomar sorvete juntos
        * não irá acontecer nada se ambos derem errados
        * */

        boolean t1 = true;
        boolean t2 = true;

        boolean comprouTv50 = t1 && t2;
        boolean comprouTv32 = t1 ^ t2;
        boolean comprouSorvete = t1 || t2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50? " + comprouTv50);
        System.out.println("Comprou TV 32? " + comprouTv32);
        System.out.println("Comprou sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);

    }
}
