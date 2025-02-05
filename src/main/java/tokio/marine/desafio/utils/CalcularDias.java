package tokio.marine.desafio.utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalcularDias {

    public Long calcularDias(LocalDate data){
        return diasAteDataAtual(data);

    }

    private Long diasAteDataAtual(LocalDate data){
        Long retorno = ChronoUnit.DAYS.between(LocalDate.now(),data);
        return retorno;
    }
}
