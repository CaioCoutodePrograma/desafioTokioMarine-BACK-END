package tokio.marine.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tokio.marine.desafio.service.TransferenciaService;

@RestController
@RequestMapping(value="transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService service;

}
