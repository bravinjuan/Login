/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Sistema {
    private List<Usuario> listaUsuarios;
    
    public Sistema(){
        listaUsuarios = new ArrayList<Usuario>();
    }
    
    public void agregarUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }
    
    public Usuario getUsuario(String nombreUsuario){
        Usuario user = null;
        for (Usuario usuario : listaUsuarios){
            if (nombreUsuario.equalsIgnoreCase(usuario.getNombreUsuario())){
                user = usuario;
                break;
            }
        }
        return user;
    }
    
    public boolean validarUsuario(String password,Usuario user){
        if (user.getPassword().equalsIgnoreCase(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
