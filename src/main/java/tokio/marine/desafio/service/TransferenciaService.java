package tokio.marine.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tokio.marine.desafio.model.FaixaTaxaModel;
import tokio.marine.desafio.model.TransfereciaModel;
import tokio.marine.desafio.repository.TransferenciaRepo;
import tokio.marine.desafio.utils.CalcularDias;

import javax.annotation.PreDestroy;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepo repository;

    @Autowired
    private FaixaTaxaService faixaTaxaService;


    public List<TransfereciaModel> findAll() {
        return repository.findAll();
    }

    public TransfereciaModel save(TransfereciaModel dado) {
        return repository.save(dado);
    }


    public FaixaTaxaModel calcularTaxa(String data){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return faixaTaxaService.calcularTaxa((new CalcularDias().calcularDias(LocalDate.parse(data,df))));

    }








}
