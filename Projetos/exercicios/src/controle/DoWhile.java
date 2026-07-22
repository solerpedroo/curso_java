package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        String texto = "";

        do{
            System.out.printf("i = %d\n", i);
            i+=3;
        } while(i <= 30);

        do{
            System.out.println("Digite sair para sair: ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("sair"));

        entrada.close();;
    }
}
