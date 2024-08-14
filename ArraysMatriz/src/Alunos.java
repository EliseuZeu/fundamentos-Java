import javax.swing.JOptionPane;

public class Alunos {
    public static void main(String[] args) {
        String [] alunos = {"JOAO", "JOSE", "MARIA"};

        float [][] notas = new float [3][4];

        float somaNotas, mediaAluno;

        String statusAluno;

        for(int i = 0; i<3; i++) {
            System.out.println("Aluno: " + alunos[i]);

            somaNotas = 0;
            mediaAluno = 0;
            for (int j = 0; j<4; j++){
                notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota n " + (j+1) + " do aluno: " + alunos[i]));
                somaNotas = somaNotas + notas[i][j];
            }

            mediaAluno = somaNotas/4;
            if(mediaAluno < 5.5) {
                System.out.println("");
            }
        }
    }
}