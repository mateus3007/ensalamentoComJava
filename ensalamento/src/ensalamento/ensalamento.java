package ensalamento;

class ensalamento {
    public static void realizarEnsalamento() {
        // Criação de professores
        Professor professor1 = new Professor("Prof. João", "Matemática");
        Professor professor2 = new Professor("Prof. Maria", "História");

        // Criação de disciplinas
        Disciplina matematica = new Disciplina("Matemática");
        Disciplina historia = new Disciplina("História");

        // Criação de alunos
        Aluno aluno1 = new Aluno("Alice", "Engenharia");
        Aluno aluno2 = new Aluno("Bob", "História");
        Aluno aluno3 = new Aluno("Carol", "Engenharia");
        Aluno aluno4 = new Aluno("David", "Matemática");

        // Criação de turmas
        Turma turma1 = new Turma(professor1, matematica);
        Turma turma2 = new Turma(professor2, historia);

        // Adicionar alunos às turmas
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno3);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno4);

        // Mostrar as turmas
        turma1.mostrarTurma();
        turma2.mostrarTurma();
    }
}