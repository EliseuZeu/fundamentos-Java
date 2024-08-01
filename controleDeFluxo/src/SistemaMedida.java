import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String planos;

        System.out.println("Ola Temos 3 Planos:");
        System.out.println("BASIC - 100 minutos de ligração");
        System.out.println("MIDIA - 100 minutos de ligração + Whats e Instagram grátis");
        System.out.println("TURBO - 100 minutos de ligração + Whats e Instagram grátis + 5GB Youtube");
        System.out.println("Por favor digite qual plano que deseja: ");
        planos = scan.nextLine();

        switch (planos) {
            case "BASIC":{
                System.out.println("Seu Plano " + planos + " Foi acionado com sucesso");    
                break;
            }
            case "MIDIA":{
                System.out.println("Seu Plano " + planos + " Foi acionado com sucesso");      
                break;
            }
            case "TURBO":{
                System.out.println("Seu Plano " + planos + " Foi acionado com sucesso");      
                break;
            }
            default:
                System.out.println("Desculpe plano não existe, por favor tente novamente.");      
                break;
        }
    }
}
