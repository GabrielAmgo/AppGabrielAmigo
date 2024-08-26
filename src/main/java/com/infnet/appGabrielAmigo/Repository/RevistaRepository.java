package com.infnet.appGabrielAmigo.Repository;

import com.infnet.appGabrielAmigo.model.Revista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevistaRepository extends CrudRepository<Revista, Integer> {
}
