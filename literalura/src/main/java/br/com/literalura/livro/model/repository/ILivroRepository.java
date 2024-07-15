package br.com.literalura.livro.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.literalura.livro.model.Livro;

public interface ILivroRepository extends CrudRepository<Livro, Long> {
}
