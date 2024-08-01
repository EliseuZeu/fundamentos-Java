
import java.util.Scanner;

public class excercicio1 {
    public static void main(String[] args) {

        int ano;
        int mes;
        int dia;
        int calcularDias;

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de anos: ");
        ano = scan.nextInt();

        System.out.println("Digite o mes: ");
        mes = scan.nextInt();

        if(mes > 12) {
            System.out.println("Meses incorreto, caso passe de 12 adicione 1 ano.");
            System.out.println("Digite o mes novamente: ");
            mes = scan.nextInt();
        }

        System.out.println("Digite o dia: ");
        dia = scan.nextInt();

        if(dia > 365) {
            System.out.println("dias esta acima de 365, adicione 1 ano a cada 365 dias.");

            System.out.println("Digite o dia novamente: ");
            dia = scan.nextInt();
        }

        calcularDias =  (ano * 365) + (mes * 30) + dia;

        System.out.println(ano + " anos + " + mes + " meses + " + dia + " dias" + " tem " + calcularDias + " dias");
        
    }
}
