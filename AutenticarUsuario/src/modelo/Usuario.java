/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan
 */
public class Usuario {
    private String nombreUsuario;
    private String password;
    
    public Usuario(String nombreUsuario,String password){
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    
    public String getNombreUsuario(){
        return this.nombreUsuario;
    }
    
    public String getPassword(){
        return this.password;
    }
}
