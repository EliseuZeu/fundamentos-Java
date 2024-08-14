import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) throws Exception {

        //declando arrya de paises
        String [] paises = new String[4];

        //percorrendo array dos numeros dos paises
        for (int i = 0; i < 4; i++) {
            paises[i] = JOptionPane.showInputDialog("Informe um pais: ");
        }

        //listando o array de paises
        for (String listaPaises : paises) {
            System.out.println(listaPaises);
        }
    }
}
