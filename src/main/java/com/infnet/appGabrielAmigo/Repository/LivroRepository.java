package com.infnet.appGabrielAmigo.Repository;

import com.infnet.appGabrielAmigo.model.Livro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer> {
}
