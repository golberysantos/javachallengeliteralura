package br.com.literalura.livro.service;

import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Service;

import br.com.literalura.livro.config.Conexao;
import br.com.literalura.livro.model.Livro;
import br.com.literalura.livro.model.repository.LivroRepository;

@Service
//public class LivroService implements LivroRepository{
public class LivroService extends Conexao {

	public void salvarLivro(Livro livro) {
			conectar();
	}

	/*
	 * @Query("INSERT INTO livro (id, titulo, autor) VALUES (:id, :titulo, :autor) ON DUPLICATE KEY UPDATE titulo = :titulo, autor = :autor"
	 * ) public void salvarLivro(Livro livro) {
	 * 
	 * }
	 */

	/*
	 * @Override public <S extends Livro> S save(S entity) {
	 * System.out.println("Save -- foi"+entity.getTitle()); return entity; }
	 * 
	 * @Override public <S extends Livro> Iterable<S> saveAll(Iterable<S> entities)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Optional<Livro> findById(Long id) { // TODO Auto-generated
	 * method stub return Optional.empty(); }
	 * 
	 * @Override public boolean existsById(Long id) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * @Override public Iterable<Livro> findAll() { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Override public Iterable<Livro> findAllById(Iterable<Long> ids) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public long count() { // TODO Auto-generated method stub return 0;
	 * }
	 * 
	 * @Override public void deleteById(Long id) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void delete(Livro entity) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAllById(Iterable<? extends Long> ids) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAll(Iterable<? extends Livro> entities) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAll() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 */

}
