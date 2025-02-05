package tokio.marine.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tokio.marine.desafio.model.FaixaTaxaModel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface FaixaTaxaRepo extends JpaRepository<FaixaTaxaModel,Long> {

    @Query("from FaixaTaxaModel where dia_de <= :dias and dia_ate >= :dias")
    Optional<FaixaTaxaModel> buscaFaixa(@Param("dias") Long dias);
}
