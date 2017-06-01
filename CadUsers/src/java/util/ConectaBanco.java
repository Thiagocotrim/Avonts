
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Família
 */
public class ConectaBanco {
    public static Connection getConexao(){
        Connection conexao = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/group_bd", "root", "");
//            Class.forName("org.postgresql.Driver");
//            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/worknessdb","postgres","1234"); 
        }catch(ClassNotFoundException erro1){
            throw new RuntimeException(erro1);
        }catch(SQLException erro2){
            throw new RuntimeException(erro2);
        } 
        return conexao;
    }
}