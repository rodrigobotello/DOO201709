/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.models;

/**
 *
 * @author arman
 */
public class Authentication {
    public static boolean authenticate(String username, String password) {

        //Variables *dummy*.
        //Se hardcodean los valores "Miguel" y "MiPassword" para emular que se obtuvieron de una base de datos
        String userDataBase = "Miguel";
        String passwordDataBase = "MiPassword";

        //username.equals(userDataBase) realiza una comparación entre las cadenas username y userDataBase
        //Si son iguales devuelve true. Si son diferentes devuelve false.
        if(username.equals(userDataBase) && password.equals(passwordDataBase)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
