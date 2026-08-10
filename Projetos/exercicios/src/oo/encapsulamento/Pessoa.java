package oo.encapsulamento;

import com.sun.source.doctree.SinceTree;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public int getIdade(){
        return idade;
    }

    // Setter
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) this.idade = novaIdade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome() + " e tenho " + getIdade();
    }

    public Pessoa(int idade, String nome, String sobrenome){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }
}
