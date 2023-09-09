package ensalamento;

import java.util.ArrayList;
import java.util.List;

class Aluno extends Pessoas {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}