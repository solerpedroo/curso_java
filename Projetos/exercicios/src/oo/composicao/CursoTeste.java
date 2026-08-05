package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.setAdicionarAluno(a1);
        curso1.setAdicionarAluno(a2);

        curso2.setAdicionarAluno(a1);
        curso2.setAdicionarAluno(a3);

        a1.setAdicionarCurso(curso3);
        a2.setAdicionarCurso(curso3);
        a3.setAdicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println("Meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(a1.cursos.get(0).alunos);

        Curso cursoEncontrado = a1.getCursoPorNome("Java Completo");

        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
