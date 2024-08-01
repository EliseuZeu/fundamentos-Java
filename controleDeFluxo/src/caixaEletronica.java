public class caixaEletronica {
 public static void main(String[] args) {
//Caixa eletronica nivel basico

    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if ( valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        
        System.out.println(saldo);
    }

    
 }
}
