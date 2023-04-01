import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RelogioTest {
    @Test
    public void deveRetornarConfiguracaoRelogio(){
        Relogio relogio = new RelogioDigital();
        assertEquals("Relógio digital", relogio.getConfiguracao());
    }

    @Test
    public void deveRetornarConfiguracaoRelogioComCronometro(){
        Relogio relogio = new Cronometro(new RelogioDigital());
        assertEquals("Relógio digital/Cronômetro", relogio.getConfiguracao());
    }

    @Test
    public void deveRetornarConfiguracaoRelogioComCalendario(){
        Relogio relogio = new Calendario(new RelogioDigital());
        assertEquals("Relógio digital/Calendário", relogio.getConfiguracao());
    }

    @Test
    public void deveRetornarConfiguracaoRelogioComIluminador(){
        Relogio relogio = new Iluminador(new RelogioDigital());
        assertEquals("Relógio digital/Iluminador", relogio.getConfiguracao());
    }

    @Test
    public void deveRetornarConfiguracaoRelogioComDespertador(){
        Relogio relogio = new Despertador(new RelogioDigital());
        assertEquals("Relógio digital/Despertador", relogio.getConfiguracao());
    }

    @Test
    public void deveRetornarConfiguracaoRelogioComCronometroComCalendarioComIluminadorComDespertador(){
        Relogio relogio = new Despertador(new Iluminador(new Calendario(new Cronometro(new RelogioDigital()))));
        assertEquals("Relógio digital/Cronômetro/Calendário/Iluminador/Despertador", relogio.getConfiguracao());
    }



}
