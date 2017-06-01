/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.User;
import util.ConectaBanco;

/**
 *
 * @author Familia
 */
public class UserDAO {
    
    private static final String INSERT_USER = "INSERT INTO users(fName, sName, email, password) VALUES (?,?,?,aes_encrypt(?,'set'))";
    
    private static final String SELECT_USER = "SELECT * FROM users";
    
    
    public void insertUser(User user) {
        Connection conexao = null;
        try {
            conexao = ConectaBanco.getConexao();

            PreparedStatement pstmt = conexao.prepareStatement(INSERT_USER);
            pstmt.setString(1, user.getfNome());
            pstmt.setString(2, user.getsNome());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());

            pstmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                throw new RuntimeException();
            }
        }
    }
    
    public ArrayList<User> listar() throws SQLException {
        //cria uma array de obj Cliente
        ArrayList<User> listaUsers = new ArrayList<User>();

        Connection conexao = ConectaBanco.getConexao();

        try {
            PreparedStatement pstmt = conexao.prepareStatement(SELECT_USER);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                User users = new User();
                users.setId(rs.getInt("id"));
                users.setfNome(rs.getString("fName"));
                users.setsNome(rs.getString("sName"));
                users.setEmail(rs.getString("email"));
                users.setBio(rs.getString("bio"));

                listaUsers.add(users);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                throw new RuntimeException();
            }
        }

        return listaUsers;
    }
    
}
