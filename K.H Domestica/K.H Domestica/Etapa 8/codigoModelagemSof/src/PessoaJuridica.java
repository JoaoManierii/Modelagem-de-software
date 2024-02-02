public class PessoaJuridica extends Cliente{
    private float CGC;
    private String Social;

    public PessoaJuridica(String telefone, String endereco, String email, float CGC, String social) {
        super(telefone, endereco, email);
        this.CGC = CGC;
        Social = social;
    }

    public float getCGC() {
        return CGC;
    }

    public void setCGC(float CGC) {
        this.CGC = CGC;
    }

    public String getSocial() {
        return Social;
    }

    public void setSocial(String social) {
        Social = social;
    }
}
