public class TV {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume ++;
    }

    public void diminuirVolume() {
        volume --;
    }

    public void aumentarCanal() {
        volume ++;
    }

    public void diminuirCanal() {
        volume --;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

}