
import dao.UserDAO;
import model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Familia
 */
public class TesteAvonts {

    public static void main(String[] args) {

        User user = new User();
        user.setfNome("Matheus");
        user.setsNome("Almeida");
        user.setEmail("matheusjunior66@gmail.com");
        user.setPassword("123456");
        user.setKey("abc");

        UserDAO uDAO = new UserDAO();
        uDAO.insertUser(user);
    }

}
