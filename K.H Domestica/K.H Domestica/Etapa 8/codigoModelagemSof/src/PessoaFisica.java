public class PessoaFisica extends Cliente{
    private String nome;

    public PessoaFisica(String telefone, String endereco, String email, String nome) {
        super(telefone, endereco, email);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
