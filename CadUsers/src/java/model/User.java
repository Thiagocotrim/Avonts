/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Familia
 */
public class User {
    
    private int id;
    private String fNome;
    private String sNome;
    private String email;
    private String password;
    private String bio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfNome() {
        return fNome;
    }

    public void setfNome(String fNome) {
        this.fNome = fNome;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
}
