package br.com.literalura.livro.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import br.com.literalura.livro.config.Conexao;
import br.com.literalura.livro.model.Livro;

@Service
public class LivroService {

	/**
	 * https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
	 * 
	 * To execute a query, call an execute method from Statement such as the following:
	 * - execute: Returns true if the first object that the query returns is a ResultSet object. Use this method if the query could return one or more ResultSet objects. Retrieve the ResultSet objects returned from the query by repeatedly calling Statement.getResultSet.
	 * - executeQuery: Returns one ResultSet object.
	 * - executeUpdate: Returns an integer representing the number of rows affected by the SQL statement. Use this method if you are using INSERT, DELETE, or UPDATE SQL statements.

	 * @throws SQLException
	 */
	public void salvarLivro(Livro livro) throws SQLException {
		String title = livro.getTitle();
		Conexao cnx = new Conexao();
		Connection cnctn = cnx.conectar();
		//cnctn.setAutoCommit(false);
		Statement stmt= cnctn.createStatement();
		
		String query = "insert into livro (title) value('"+title+"')";
		int row = stmt.executeUpdate(query);
		stmt.close();
		
		System.out.println("row >>> " + row);

	}

}
