package tokio.marine.desafio.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import tokio.marine.desafio.model.FaixaTaxaModel;
import tokio.marine.desafio.repository.FaixaTaxaRepo;
import tokio.marine.desafio.service.FaixaTaxaService;

import java.math.BigDecimal;

@Configuration
public class StartConfig {

    @Autowired
    public FaixaTaxaService service;
    @Bean
    public void inicializarValoresFaixaTaxa() {


        service.save(new FaixaTaxaModel("faixa01",new BigDecimal(3),new BigDecimal("0.025"),0,0));
        service.save(new FaixaTaxaModel("faixa02",new BigDecimal(12),new BigDecimal("0.0"), 1,10));
        service.save(new FaixaTaxaModel("faixa03",new BigDecimal(0),new BigDecimal("0.082"),11,20));
        service.save(new FaixaTaxaModel("faixa04",new BigDecimal(0),new BigDecimal("0.069"),21,30));
        service.save(new FaixaTaxaModel("faixa05",new BigDecimal(0),new BigDecimal("0.047"),31,40));
        service.save(new FaixaTaxaModel("faixa06",new BigDecimal(0),new BigDecimal("0.017"),41,50));

        service.destroy();
    }

}
