package tokio.marine.desafio.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "TRANSFERENCIA")
@Data
public class TransfereciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name="data_transferencia")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataTransferencia;

    @Column(name="data_agendamento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataAgendamento;

    @ManyToOne
    @JoinColumn(name = "faixa_taxa_id")
    private FaixaTaxaModel faixaTaxa;

    @Column(name="valor")
    private double valor;

    @Column(name="conta_origem")
    private String contaOrigem;

    @Column(name="conta_destino")
    private String contaDestino;
}
