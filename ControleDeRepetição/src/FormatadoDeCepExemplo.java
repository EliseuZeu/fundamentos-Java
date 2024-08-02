public class FormatadoDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("32654234");

        }catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras de negocio");
        }
    }


    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8 )
        throw new CepInvalidoException();
        
        return "23.765-542";
    }

}

