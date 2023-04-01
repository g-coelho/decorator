public abstract class RelogioDecorator implements Relogio{
    private Relogio relogio;
    public String configuracao;

    public RelogioDecorator(Relogio relogio){
        this.relogio = relogio;
    }

    public Relogio getRelogio() {
        return relogio;
    }

    public abstract String getNomeConfiguracao();


    public String getConfiguracao() {
        return this.relogio.getConfiguracao() + "/" + this.getNomeConfiguracao();
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}
