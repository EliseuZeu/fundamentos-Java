package Construtores;

import Construtores.Aluno.matricula;

public class Construtor {
    public static void main(String[] args) {
        Aluno alu = new Aluno(8, 9, 10);

        double mediAlunoFinal = alu.calcularMediaAluno();

        if (mediAlunoFinal < 6) {
            alu.situacaoAluno = STATUS.REPROVADO;
        } else {
            alu.situacaoAluno = STATUS.APROVADO;
        }


        // uso enum matricula
        alu.situacaoMatricula = MATRICULA.MATRICULADO;
    }
}