public class Limpador extends Funcionario{
    private int comissao;
    


    public Limpador(String nome, String telefone, String email, float salario,int comissao) {
        super(nome, telefone, email, salario);
        this.comissao = comissao;
    }

    public void realizaTreinamento(){

    }
    public void realizaServico(){

    }
    public void calculaSalario(){

    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
}
