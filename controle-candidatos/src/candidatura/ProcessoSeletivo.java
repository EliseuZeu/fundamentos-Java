package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println();
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTetanndo = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTetanndo = !atendeu;
            if (continuarTetanndo) {
                tentativasRealizadas++;
            }else {
                System.out.println("CONTATO REALIZAOD COM SUCESSO");
            }

        }while(continuarTetanndo && tentativasRealizadas<3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato);
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "CARLOS", "JOAO", "MONIQUE", "PAULO"};
        System.out.println("Imprimindo a lista de cadidatos, informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice ++) {
            System.out.println("O candidato de n " + (indice+1) + " indice " + candidatos[indice]);


            for(String candidato: candidatos) {
                System.out.println("Os candidado selecionado foi: " + candidato);
            }
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "CARLOS", "JOAO", "MONIQUE", "PAULO","JORGE", "WILLIAN", "ROGER"};

        int candidatosSelecionados =0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while ((candidatosSelecionados <5 && candidatoAtual < candidatos.length)) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();


            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIAGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    } 
}
