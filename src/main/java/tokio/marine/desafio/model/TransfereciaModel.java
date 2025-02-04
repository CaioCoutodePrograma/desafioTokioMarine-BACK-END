package tokio.marine.desafio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
@Entity
public class TransfereciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name="data_transferencia")
    private Date dataTransferencia;

    @Column(name="data_agendamento")
    private Date dataAgendamento;

    @Column(name="taxa")
    private double taxa;

    @Column(name="valor")
    private double valor;

    @Column(name="conta_origem")
    private String contaOrigem;

    @Column(name="conta_destino")
    private String contaDestino;
}
