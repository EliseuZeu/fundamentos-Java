package Construtores;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    STATUS situacaoAluno;
    MATRICULA situacaoMatricula;

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public enum MATRICULA {
        MATRICULADO,
        PEDENTE,
        RECUSADO
    }
    

    //DEFININDO UM ENUMERADOR 

    public enum STATUS {
        APROVADO,
        REPROVADO
    }

}