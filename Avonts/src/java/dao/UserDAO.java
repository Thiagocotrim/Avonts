/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;
import util.ConectaBanco;

/**
 *
 * @author Familia
 */
public class UserDAO {
    
    private static final String INSERT_USER = "INSERT INTO users(fName, sName, email, password, keyPass) VALUES (?,?,?,aes_encrypt(?,'set'),aes_encrypt(?,'set'))";
    
    public void insertUser(User user) {
        Connection conexao = null;
        try {
            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(INSERT_USER);
            pstmt.setString(1, user.getfNome());
            pstmt.setString(2, user.getsNome());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getKey());

            pstmt.execute();

//            ResultSet rsId = pstmt.getGeneratedKeys();
//            if(rsId.next()){
//                idUsuario = rsId.getInt("id");
//            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                throw new RuntimeException();
            }
        }
//        return idUsuario;
    }
    
}
