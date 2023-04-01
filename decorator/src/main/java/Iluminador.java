public class Iluminador extends RelogioDecorator{
    public Iluminador(Relogio relogio) {
        super(relogio);
    }

    public String getNomeConfiguracao() {
        return "Iluminador";
    }
}
