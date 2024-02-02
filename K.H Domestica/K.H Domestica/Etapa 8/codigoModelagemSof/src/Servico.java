public class Servico {
    private String codigoServico;
    private String descricao;
    private float valorPorMetro2;
    private float duracaoPorMetro2;
    private boolean disponivel;

    public Servico(String codigoServico, String descricao, float valorPorMetro2, float duracaoPorMetro2, boolean disponivel) {
        this.codigoServico = codigoServico;
        this.descricao = descricao;
        this.valorPorMetro2 = valorPorMetro2;
        this.duracaoPorMetro2 = duracaoPorMetro2;
        this.disponivel = disponivel;
    }

    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorPorMetro2() {
        return valorPorMetro2;
    }

    public void setValorPorMetro2(float valorPorMetro2) {
        this.valorPorMetro2 = valorPorMetro2;
    }

    public float getDuracaoPorMetro2() {
        return duracaoPorMetro2;
    }

    public void setDuracaoPorMetro2(float duracaoPorMetro2) {
        this.duracaoPorMetro2 = duracaoPorMetro2;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
