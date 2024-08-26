package com.infnet.appGabrielAmigo.Repository;

import com.infnet.appGabrielAmigo.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
