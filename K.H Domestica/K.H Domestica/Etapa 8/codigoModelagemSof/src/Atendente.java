public class Atendente extends Funcionario{
    private String feedBackAtendimento;

    public Atendente(String nome, String telefone, String email, float salario,String feedBackAtendimento) {
        super(nome, telefone, email, salario);
        this.feedBackAtendimento = feedBackAtendimento;
    }

    public void cadastrarCliente(){

    }
    public void verificaDadosCliente(){

    }
    public void consultaTabelaServiços(){

    }
    public void preenchePedido(){

    }
    public void informaCliente(){

    }

    public String getFeedBackAtendimento() {
        return feedBackAtendimento;
    }

    public void setFeedBackAtendimento(String feedBackAtendimento) {
        this.feedBackAtendimento = feedBackAtendimento;
    }
}
