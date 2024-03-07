package br.com.fiap.digitaltwinstech.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.digitaltwinstech.model.Categoria;

@RestController
@RequestMapping("categoriaproduto")
public class CategoriaController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();

    //GET
    @GetMapping
    public List<Categoria> index(){
        return repository; 
    }

    //POST
    @PostMapping
    public ResponseEntity<Categoria> create(@RequestBody Categoria categoria ){
        log.info("Categoria cadastrada {}", categoria);
        repository.add(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Categoria> show(@PathVariable Long id) {
        log.info("Buscando categoria com id {}", id);

        for (Categoria categoria : repository) {
            if (categoria.id().equals(id)) 
                return ResponseEntity.status(HttpStatus.OK).body(categoria);
        }
        
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    
    }
}