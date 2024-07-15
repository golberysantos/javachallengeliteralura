package br.com.literalura.livro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.literalura.livro.model.Livro;
import br.com.literalura.livro.model.repository.ILivroRepository;

@Service
public class LivroService {
	private final ILivroRepository livroRepository;

    @Autowired
    public LivroService(ILivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public void criar(Livro livro) {
        livroRepository.save(livro);
    }

}
