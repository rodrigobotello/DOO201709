/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.models;

/**
 *
 * @author arman
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String nombre;
    private String apellidos;
    private String ocupacion;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
    }

    public String getUsername() {
        return this.username;
    }
}
