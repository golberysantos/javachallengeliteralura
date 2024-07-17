package br.com.literalura.livro.model.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.literalura.livro.model.Livro;

@Repository
//public interface LivroRepository extends CrudRepository<Livro, Long> {
public interface LivroRepository {	
    
    public void salvarLivro(Livro livro);
}
