public class Calendario extends RelogioDecorator{
    public Calendario(Relogio relogio) {
        super(relogio);
    }

    public String getNomeConfiguracao() {
        return "Calendário";
    }
}
