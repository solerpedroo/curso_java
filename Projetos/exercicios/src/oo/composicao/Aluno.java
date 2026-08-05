package oo.composicao;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    void setAdicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString(){
        return nome;
    }

    Curso getCursoPorNome(String nome){
        for (Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    Aluno(String nome){
        this.nome = nome;
    }
}
