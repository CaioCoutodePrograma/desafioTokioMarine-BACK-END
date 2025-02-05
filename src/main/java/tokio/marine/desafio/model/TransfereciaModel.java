package tokio.marine.desafio.model;

import lombok.Data;

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
    private LocalDate dataTransferencia;

    @Column(name="data_agendamento")
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
