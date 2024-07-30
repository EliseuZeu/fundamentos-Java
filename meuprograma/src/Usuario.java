public class Usuario {
    public static void main(String[] args) {
        
        TV smarTv = new TV();

        //metodo ligar e desligar tv

        smarTv.ligar();
        smarTv.desligar();
        smarTv.ligar();
        smarTv.mudarCanal(31);
        smarTv.aumentarVolume();

      

        if( smarTv.ligada == true) {
            System.out.println("A Tv esta ligada: " + smarTv.ligada + " Canal: " + smarTv.canal + " Volume: " + smarTv.volume);
        } else {
            System.out.println("A TV esta desligada");
        }
    }
}
