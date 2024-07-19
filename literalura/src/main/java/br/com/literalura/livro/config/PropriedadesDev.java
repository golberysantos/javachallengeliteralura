package br.com.literalura.livro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class PropriedadesDev {

	private final Environment ENV;	
	
	@Autowired
    public PropriedadesDev(Environment env) {
        this.ENV = env;
    }
	
	@Bean
	public Environment propriedadesApplication() {
		return ENV;
	}
}
