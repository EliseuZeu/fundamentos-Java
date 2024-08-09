

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;


    public Pessoa(String cpf, String nome) {
        this.cpf =cpf;
        this.nome = nome;
    }

    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}