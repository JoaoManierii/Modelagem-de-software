import java.util.Date;

public class Pedido {
    private Date duracao;
    private float valorUnitario;
    private float valorTotal;

    public Pedido(Date duracao, float valorUnitario, float valorTotal) {
        this.duracao = duracao;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
