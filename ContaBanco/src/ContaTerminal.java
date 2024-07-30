import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //importando o scanner com locale
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


         System.out.println("Digite seu nome: ");
         String nomeCliente = scanner.next();

         System.out.println("--------------------------------");

         System.out.println("Digite Agencia: ");
         String agencia = scanner.next();
         
         System.out.println("--------------------------------");

         System.out.println("Digite o numero: ");
         int numero = scanner.nextInt();

         System.out.println("--------------------------------");

         System.out.println("Digite o saldo: ");
         float saldo = scanner.nextFloat();


         System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo para saque " + saldo);

    }    
}
