
package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;


public class PessoaDao {
//    public void salvar(Contato contatoParam) throws SQLException{
//		ConnectionFactory conexaoFactory = new ConnectionFactory();
//		Connection conexao = conexaoFactory.getConnection();
//		String sql = "insert into contatos" +
//				" (nome,email,endereco,dataNascimento)" +
//				" values (?,?,?,?)";
//				PreparedStatement stmt = conexao.prepareStatement(sql);
//				// preenche os valores
//				stmt.setString(1, contatoParam.getNome());
//				stmt.setString(2, contatoParam.getEmail());
//				stmt.setString(3, contatoParam.getEndereco());
//				stmt.setDate(4, new java.sql.Date(contatoParam.getDataNascimento().getTime()));
//				// executa
//				stmt.execute();
//				stmt.close();
//				System.out.println("Gravado!");
//				conexao.close();
//	}
//	
//	public List<Contato> getListaContato() throws SQLException{
//		ConnectionFactory conexaoFactory = new ConnectionFactory();
//		Connection conexao = conexaoFactory.getConnection();
//		PreparedStatement stm = conexao.prepareStatement("select * from contatos");
//		ResultSet result = stm.executeQuery();
//		
//		List<Contato> contatos = new ArrayList<Contato>();
//		while(result.next()){
//			Contato contato = new Contato();
//			contato.setId(result.getLong("id"));
//			contato.setNome(result.getString("nome"));
//			contato.setEmail(result.getString("email"));
//			contato.setEndereco(result.getString("endereco"));
//			contato.setDataNascimento(result.getDate("dataNascimento"));
//			contatos.add(contato);
//		}
//		conexao.close();
//		return contatos;
//	}
    
    
    
}
