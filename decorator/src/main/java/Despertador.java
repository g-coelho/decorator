public class Despertador extends RelogioDecorator{
    public Despertador(Relogio relogio) {
        super(relogio);
    }

    public String getNomeConfiguracao() {
        return "Despertador";
    }
}
