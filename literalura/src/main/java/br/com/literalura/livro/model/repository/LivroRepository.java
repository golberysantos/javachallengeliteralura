package br.com.literalura.livro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.literalura.livro.model.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {
    public void salvarLivro(Livro livro);
}
