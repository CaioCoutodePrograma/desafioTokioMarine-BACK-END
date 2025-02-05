package tokio.marine.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tokio.marine.desafio.model.TransfereciaModel;

import java.util.Optional;

@Repository
public interface TransferenciaRepo extends JpaRepository<TransfereciaModel,Long> {


}
