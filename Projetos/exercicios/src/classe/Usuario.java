package classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object obj) {
        // convertendo um obj, genérico, classe "primária" e faz um cast para Usuario

        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}
