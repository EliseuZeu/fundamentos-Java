import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array [];

        System.out.println("Digite o primeiro numero: ");
        int parametroUm = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int parametroDois = scan.nextInt();

        for(int interacao = parametroUm; interacao <= parametroDois; interacao++){
            System.out.println("Print do numero e: " + interacao);
        }

    }
}
