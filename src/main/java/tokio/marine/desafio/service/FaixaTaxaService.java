package tokio.marine.desafio.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tokio.marine.desafio.exceptions.BusinessException;
import tokio.marine.desafio.model.FaixaTaxaModel;
import tokio.marine.desafio.model.TransfereciaModel;
import tokio.marine.desafio.repository.FaixaTaxaRepo;
import tokio.marine.desafio.repository.TransferenciaRepo;
import tokio.marine.desafio.utils.MessageUtils;

import javax.annotation.PreDestroy;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FaixaTaxaService {

    @Autowired
    private FaixaTaxaRepo repository;


    public FaixaTaxaModel calcularTaxa(Long dias) {
        Optional<FaixaTaxaModel> retorno = repository.buscaFaixa(dias);
        if(retorno.isEmpty()){
            throw new BusinessException(MessageUtils.FAIXA_NO_EXISTS);
        }
        return retorno.get();
    }

    public FaixaTaxaModel save(FaixaTaxaModel faixaTaxa) {
        return repository.save(faixaTaxa);
    }

    @PreDestroy
    public void destroy(){}


}
