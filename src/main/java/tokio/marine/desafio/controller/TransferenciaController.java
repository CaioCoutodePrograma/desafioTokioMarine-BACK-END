package tokio.marine.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tokio.marine.desafio.model.FaixaTaxaModel;
import tokio.marine.desafio.model.TransfereciaModel;
import tokio.marine.desafio.service.TransferenciaService;


import java.util.List;

@RestController
@RequestMapping(value="transferencia")
public class TransferenciaController {


    @Autowired
    private TransferenciaService service;

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public ResponseEntity<List<TransfereciaModel>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @CrossOrigin
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public ResponseEntity<TransfereciaModel> save(@RequestBody TransfereciaModel dado) {
        return ResponseEntity.ok(service.save(dado));
    }

    @RequestMapping(value = "/calcular-taxa", produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public ResponseEntity<FaixaTaxaModel> cacularTaxa(@RequestParam String data) {
        return ResponseEntity.ok(service.calcularTaxa(data));
    }




}
