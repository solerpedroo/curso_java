package controle;

public class DesafioIf {
    public static void main(String[] args) {
        double nota = 1.3;

        if(nota>=9.0);{
            System.out.println("Fera");
        }

        /* RESPOSTA:
        * Código com incosistência, ele irá printar o "Fera" por conta do ";" após o if, mesmo a condição estando certa
        * pois ele quebra o controle do if e identifca o System.out como um bloco de código, o correto seria:
        *
        * if(nota>=9.0){
            System.out.println("Fera");
          }
        * */
    }
}
