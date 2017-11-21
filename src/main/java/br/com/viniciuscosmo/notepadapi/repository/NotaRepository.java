package br.com.viniciuscosmo.notepadapi.repository;

import br.com.viniciuscosmo.notepadapi.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotaRepository extends MongoRepository<Nota, String> {
    List<Nota> findByTitulo(String titulo);

}
