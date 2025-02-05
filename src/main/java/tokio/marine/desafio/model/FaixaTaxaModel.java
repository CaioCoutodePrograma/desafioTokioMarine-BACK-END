package tokio.marine.desafio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
@Data
@Table(name = "FAIXA_TAXA")
@Entity
public class FaixaTaxaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column(name="faixa")
    private String faixa;
    @Column(name="reais")
    private BigDecimal reais;
    @Column(name="taxa",scale = 3,precision = 5)
    private BigDecimal taxa;
    @Column(name = "dia_de")
    private Long diaDe;
    @Column(name = "dia_ate")
    private Long diaAte;

    public FaixaTaxaModel(String faixa, BigDecimal reais, BigDecimal taxa,Number diaDe, Number diaAte) {
        this.faixa = faixa;
        this.reais = reais;
        this.taxa = taxa;
        this.diaDe = diaDe.longValue();
        this.diaAte = diaAte.longValue();
    }

    public FaixaTaxaModel(){

    }





}
