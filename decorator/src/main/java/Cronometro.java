public class Cronometro extends RelogioDecorator{
    public Cronometro(Relogio relogio) {
        super(relogio);
    }
    public String getNomeConfiguracao() {
        return "Cronômetro";
    }
}
